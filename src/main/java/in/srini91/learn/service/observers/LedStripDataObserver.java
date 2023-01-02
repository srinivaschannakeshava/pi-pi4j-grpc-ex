package in.srini91.learn.service.observers;

import java.time.Instant;

import com.pi4j.context.Context;

import in.srini91.learn.pi4j.catalog.components.LEDStrip;
import in.srini91.learn.proto.models.LedStripData;
import in.srini91.learn.service.Pi4jInstanceProvider;
import io.grpc.stub.StreamObserver;

public class LedStripDataObserver implements StreamObserver<LedStripData> {

	private StreamObserver<LedStripData> responseObserver;
	private LedStripData lastState;
	private LEDStrip ledstrip;
	private Context pi4j;
	private Instant instant = Instant.now();

	public LedStripDataObserver(StreamObserver<LedStripData> responseObserver) {
		super();
		this.responseObserver = responseObserver;
		this.pi4j = Pi4jInstanceProvider.getLedStripContext();

	}

	@Override
	public void onNext(LedStripData value) {
		int pixelColor = value.getPixelColor();
		if (ledstrip == null) {
			ledstrip = new LEDStrip(this.pi4j, value.getPixelCount(), value.getBrightness());
//			lastState = value;
			ledstrip.allOff();
			ledstrip.setStripColor(pixelColor);
			ledstrip.render();
//			sleep(1500);
//			instant = Instant.now();
			System.out.println("Intialized LED strip!!");
		} else {
			if (value.getTurnOff()) {
				System.out.println("Turnning LED OFF");
				ledstrip.allOff();
				ledstrip.render();
//				sleep(1500);
//				instant = Instant.now();
			} else // if (!value.getTurnOff()) {// Duration.between(instant,
					// Instant.now()).toMillis() > 500 &&
					// && lastState.getPixelColor() != pixelColor
			{
				System.out.println("Setting Color : " + pixelColor);
				ledstrip.allOff();
				ledstrip.setStripColor(pixelColor);
				ledstrip.render();
//				instant = Instant.now();
//				lastState = value;
//				sleep(1500);
			}

		}

	}

	@Override
	public void onError(Throwable t) {
		ledstrip.allOff();
		ledstrip.render();
		ledstrip.close();
		pi4j.shutdown();
	}

	@Override
	public void onCompleted() {
		responseObserver.onNext(lastState);
		responseObserver.onCompleted();
		ledstrip.allOff();
//		sleep(1000);
		ledstrip.close();
		pi4j.shutdown();
	}

	private void sleep(int millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
