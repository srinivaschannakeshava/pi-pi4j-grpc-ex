package in.bosch.sdv.service;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.io.serial.FlowControl;
import com.pi4j.io.serial.Parity;
import com.pi4j.io.serial.Serial;
import com.pi4j.io.serial.StopBits;
import com.pi4j.library.pigpio.PiGpio;
import com.pi4j.plugin.pigpio.provider.gpio.digital.PiGpioDigitalInputProvider;
import com.pi4j.plugin.pigpio.provider.gpio.digital.PiGpioDigitalOutputProvider;
import com.pi4j.plugin.pigpio.provider.serial.PiGpioSerialProvider;
import com.pi4j.plugin.pigpio.provider.spi.PiGpioSpiProvider;

import in.bosch.sdv.PiGrpcGpioApplication;

public class Pi4jInstanceProvider {

	private static Context pi4jTouchContext;
	private static Context pi4jLedStripContext;
	private static Context pi4jUARTContext;
	private static Serial uartSerial;
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
					.add(PiGpioDigitalOutputProvider.newInstance(piGpio), PiGpioSpiProvider.newInstance(piGpio),
							PiGpioSerialProvider.newInstance(piGpio))
					.build();
		else {
			pi4jLedStripContext.shutdown();
			pi4jLedStripContext = Pi4J.newContextBuilder().noAutoDetect()
					.add(PiGpioDigitalOutputProvider.newInstance(piGpio), PiGpioSpiProvider.newInstance(piGpio),
							PiGpioSerialProvider.newInstance(piGpio))
					.build();
		}
		return pi4jLedStripContext;
	}

	public static Serial getUARTSerialContext() {
		System.out.println("Getting UART PI4J Context");
		if (null == pi4jUARTContext) {
			pi4jUARTContext = Pi4J.newContextBuilder().noAutoDetect().add(PiGpioSerialProvider.newInstance(piGpio))
					.build();
			System.out.println("Serial Port Open");
			uartSerial = pi4jUARTContext.create(Serial.newConfigBuilder(pi4jUARTContext).use_9600_N81().dataBits_8()
					.parity(Parity.NONE).stopBits(StopBits._1).flowControl(FlowControl.NONE).id("pizero-uart")
					.device("/dev/ttyS0").provider("pigpio-serial").build());
			uartSerial.open();
			while (!uartSerial.isOpen()) {
				System.out.println("waiting serial ...");
				PiGrpcGpioApplication.sleep(250);
			}
			System.out.println("Serial Port Opened!!!");

		}
//					.add(PiGpioDigitalInputProvider.newInstance(piGpio),
//							PiGpioDigitalOutputProvider.newInstance(piGpio), PiGpioPwmProvider.newInstance(piGpio),
//							PiGpioSerialProvider.newInstance(piGpio), PiGpioSpiProvider.newInstance(piGpio),
//							LinuxFsI2CProvider.newInstance())
////					.build();
//		else {
//			pi4jUARTContext.shutdown();
//			pi4jUARTContext = Pi4J.newContextBuilder().noAutoDetect()
//					.add(PiGpioSerialProvider.newInstance(PiGpio.newNativeInstance())).build();
//		}
		return uartSerial;
	}

}
