package in.bosch.sdv.ex.app;

import com.pi4j.context.Context;

import in.bosch.sdv.Application;
import in.bosch.sdv.pi4j.catalog.components.SimpleLED;
import in.bosch.sdv.pi4j.catalog.components.helpers.PIN;

/**
 * This example shows how to use the simple LED component by creating a flashing
 * light by repeatedly toggling the LED on and off.
 */
public class SimpleLED_App implements Application {
	@Override
	public void execute(Context pi4j) {
		System.out.println("Simple LED app started ...");

		// Create a new SimpleLED component
		SimpleLED led = new SimpleLED(pi4j, PIN.D26);

		// Turn on the LED to have a defined state
		System.out.println("Turn on LED.");
		led.on();
		delay(1000);

		// Make a flashing light by toggling the LED every second
		for (int i = 0; i < 10; i++) {
			System.out.println("Current LED state is " + led.toggleState() + ".");
			delay(1000);
		}

		// That's all so turn off the relay and quit
		led.off();
		System.out.println("Turn off LED.");
		delay(2000);

		System.out.println("Simple LED app done.");
	}
}
