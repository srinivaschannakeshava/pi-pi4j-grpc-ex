package in.bosch.sdv;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.library.pigpio.PiGpio;
import com.pi4j.plugin.pigpio.provider.gpio.digital.PiGpioDigitalInputProvider;
import com.pi4j.plugin.pigpio.provider.gpio.digital.PiGpioDigitalOutputProvider;
import com.pi4j.plugin.pigpio.provider.pwm.PiGpioPwmProvider;
import com.pi4j.plugin.pigpio.provider.serial.PiGpioSerialProvider;
import com.pi4j.plugin.pigpio.provider.spi.PiGpioSpiProvider;

import in.bosch.sdv.ex.app.LEDStrip_App;

public class PiGrpcGpioApplicationExample {

	private final List<ApplicationRunner> runners = new ArrayList<>();

	private Context pi4j;

	public static void main(String[] args) {
		System.out.println("OS type : " + System.getProperty("os.name"));
		PiGrpcGpioApplicationExample app = new PiGrpcGpioApplicationExample();

		PiGpio piGpio = PiGpio.newNativeInstance();
//		app.pi4j = Pi4J.newContextBuilder().noAutoDetect().add(new RaspberryPiPlatform() {
//			@Override
//			protected String[] getProviders() {
//				return new String[] {};
//			}
//		}).add(PiGpioDigitalInputProvider.newInstance(piGpio), PiGpioDigitalOutputProvider.newInstance(piGpio),
//				PiGpioPwmProvider.newInstance(piGpio), PiGpioSerialProvider.newInstance(piGpio),
//				PiGpioSpiProvider.newInstance(piGpio)).build();

		app.pi4j = Pi4J.newContextBuilder().noAutoDetect()
				.add(PiGpioDigitalInputProvider.newInstance(piGpio), PiGpioDigitalOutputProvider.newInstance(piGpio),
						PiGpioPwmProvider.newInstance(piGpio), PiGpioSerialProvider.newInstance(piGpio),
						PiGpioSpiProvider.newInstance(piGpio))
				.build();

//		app.runners.add(new ApplicationRunner(new SimpleLED_App(), app.pi4j));
		app.runners.add(new ApplicationRunner(new LEDStrip_App(), app.pi4j));
		try {
			List<Target> targets = app.buildTargets();
			targets.forEach(Target::run);
			app.pi4j.shutdown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Presents the passed list of targets to the user as a numbered list and waits
	 * until a valid choice via stdin has been made. If an invalid input occurs,
	 * this method will keep retrying until a valid value has been entered.
	 *
	 * @param targets List of targets to present as a choice
	 * @return Selected target by user
	 */
	private Target getTargetInteractively(List<Target> targets) {
		// Print numbered list of available targets starting at 1
		System.out.println("> The following launch targets are available:");
		for (int i = 0; i < targets.size(); i++) {
			System.out.println((i + 1) + ") " + targets.get(i).getLabel());
		}

		// Wait for valid choice of user via stdin
		final Scanner in = new Scanner(System.in);
		int choice = 0;
		while (choice < 1 || choice > targets.size()) {
			System.out.println("> Please choose your desired launch target by typing its number:");
			try {
				choice = in.nextInt();
			} catch (InputMismatchException ignored) {
				in.next();
			}
		}

		// Return selected choice
		return targets.get(choice - 1);
	}

	/**
	 * Builds a list of launcher targets based on static entries and available
	 * application runners
	 *
	 * @return List of targets
	 */
	private List<Target> buildTargets() {
		ArrayList<Target> targets = new ArrayList<Target>();

		// Append target for exiting launcher
		// This can be achieved by ensuring that demo mode is disabled, as the launcher
		// will exit too once the application exits
//		targets.add(new Target("Exit launcher without running application", () -> demoMode = false, true));

		// Append list of application targets
		targets.addAll(this.runners.stream().map(runner -> {
			final Application runnerApp = runner.getApp();
			final String runnerLabel = runnerApp.getName() + " (" + runnerApp.getDescription() + ")";
			return new Target(runnerLabel, runner);
		}).collect(Collectors.toList()));

		return targets;
	}

}

/**
 * Helper class for representing launcher targets which can be interactively
 * chosen if the user does not specify a single app.
 */
final class Target implements Runnable {
	private final String label;
	private final Runnable runnable;
	private final boolean isSilent;

	public Target(String label, Runnable runnable) {
		this(label, runnable, false);
	}

	public Target(String label, Runnable runnable, boolean isSilent) {
		this.label = label;
		this.runnable = runnable;
		this.isSilent = isSilent;
	}

	@Override
	public void run() {
		if (!isSilent) {
			System.out.println("> Launching target [" + getLabel() + "]");
		}
		runnable.run();
		if (!isSilent) {
			System.out.println("> Target [" + getLabel() + "] has exited");
		}
	}

	public String getLabel() {
		return label;
	}
}

final class ApplicationRunner implements Runnable {
	private final Application app;

	private final Context pi4j;

	public ApplicationRunner(Application app, Context pi4j) {
		this.app = app;
		this.pi4j = pi4j;
	}

	@Override
	public void run() {
		this.app.execute(this.pi4j);
	}

	Application getApp() {
		return this.app;
	}
}