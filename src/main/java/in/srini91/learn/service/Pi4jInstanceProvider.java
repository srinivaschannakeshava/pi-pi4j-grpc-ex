package in.srini91.learn.service;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.library.pigpio.PiGpio;
import com.pi4j.plugin.pigpio.provider.gpio.digital.PiGpioDigitalInputProvider;
import com.pi4j.plugin.pigpio.provider.gpio.digital.PiGpioDigitalOutputProvider;
import com.pi4j.plugin.pigpio.provider.spi.PiGpioSpiProvider;

public class Pi4jInstanceProvider {

	private static Context pi4jTouchContext;
	private static Context pi4jLedStripContext;
	private static PiGpio piGpio = PiGpio.newNativeInstance();

	private Pi4jInstanceProvider() {
	}

	public static Context getPi4jTouchContext() {
		if (null == pi4jTouchContext)
			pi4jTouchContext = Pi4J.newContextBuilder().noAutoDetect()
					.add(PiGpioDigitalInputProvider.newInstance(piGpio)).build();
		else {
			pi4jTouchContext.shutdown();
			pi4jTouchContext = Pi4J.newContextBuilder().noAutoDetect()
					.add(PiGpioDigitalInputProvider.newInstance(piGpio)).build();
		}
		return pi4jTouchContext;
	}

	public static Context getLedStripContext() {
		if (null == pi4jLedStripContext)
			pi4jLedStripContext = Pi4J.newContextBuilder().noAutoDetect()
					.add(PiGpioDigitalOutputProvider.newInstance(piGpio), PiGpioSpiProvider.newInstance(piGpio))
					.build();
		else {
			pi4jLedStripContext.shutdown();
			pi4jLedStripContext = Pi4J.newContextBuilder().noAutoDetect()
					.add(PiGpioDigitalOutputProvider.newInstance(piGpio), PiGpioSpiProvider.newInstance(piGpio))
					.build();
		}
		return pi4jLedStripContext;
	}

}
