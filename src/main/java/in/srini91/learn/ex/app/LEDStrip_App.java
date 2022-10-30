package in.srini91.learn.ex.app;

import com.pi4j.context.Context;

import in.srini91.learn.Application;
import in.srini91.learn.pi4j.catalog.components.LEDStrip;
import in.srini91.learn.pi4j.catalog.components.PixelColor;

/**
 * This example shows how to use the LEDStrip component by setting the LEDs on
 * the strip to different colors
 */
public class LEDStrip_App implements Application {
	@Override
	public void execute(Context pi4j) {
		// Initialize the RGB
		int pixels = 8;
		final LEDStrip ledstrip = new LEDStrip(pi4j, pixels, 0.5);

		// set them all off, so nothing is shining
		System.out.println("Starting with setting all leds off");
		ledstrip.allOff();

		System.out.println("setting the LEDs to RED");
		ledstrip.setStripColor(PixelColor.RED);
		ledstrip.render();
		delay(3000);

		System.out.println("setting the LEDs to Light Blue");
		ledstrip.setStripColor(PixelColor.LIGHT_BLUE);
		ledstrip.render();
		delay(3000);

		System.out.println("setting the LEDs to Light Purple");
		ledstrip.setStripColor(PixelColor.PURPLE);
		ledstrip.render();
		delay(3000);

		System.out.println("setting the LEDs to Light Green");
		ledstrip.setStripColor(PixelColor.GREEN);
		ledstrip.render();
		delay(3000);

		System.out.println("setting the first led to Purple");
		ledstrip.setPixelColor(0, PixelColor.PURPLE);
		ledstrip.render();
		delay(3000);

		System.out.println("setting the brightness to full and just show the first led as White");
		ledstrip.allOff();
		ledstrip.setBrightness(1);
		ledstrip.setPixelColor(0, PixelColor.WHITE);
		ledstrip.render();
		delay(3000);

		// finishing and closing
		ledstrip.close();
		System.out.println("closing the app");
		System.out.println("Color " + ledstrip.getPixelColor(0));
	}
}