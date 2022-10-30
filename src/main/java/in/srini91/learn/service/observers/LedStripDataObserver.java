package in.srini91.learn.service.observers;

import java.time.Duration;
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
			lastState = value;
			ledstrip.setStripColor(pixelColor);
			ledstrip.render();
			sleep(1000);
			ledstrip.setStripColor(pixelColor);
			ledstrip.render();
			instant = Instant.now();
			System.out.println("Intialized LED strip!!");
		} else {
			if (Duration.between(instant, Instant.now()).toMillis() > 3000 && lastState.getPixelColor() != pixelColor) {
				System.out.println("Setting Color : " + pixelColor);
				ledstrip.setStripColor(pixelColor);
				ledstrip.render();
				instant = Instant.now();
				lastState = value;
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
		ledstrip.render();
		sleep(2000);
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
