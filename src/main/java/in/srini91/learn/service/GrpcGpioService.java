package in.srini91.learn.service;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import com.pi4j.library.pigpio.PiGpio;
import com.pi4j.plugin.pigpio.provider.gpio.digital.PiGpioDigitalInputProvider;

import in.srini91.learn.pi4j.catalog.components.SimpleButton;
import in.srini91.learn.pi4j.catalog.components.helpers.PIN;
import in.srini91.learn.proto.models.GpioData;
import in.srini91.learn.proto.models.GpioDigitalState;
import in.srini91.learn.proto.models.GpioRequest;
import in.srini91.learn.proto.models.LedStripData;
import in.srini91.learn.proto.models.PodmanDemoServiceGrpc.PodmanDemoServiceImplBase;
import in.srini91.learn.service.observers.LedStripDataObserver;
import io.grpc.stub.StreamObserver;

public class GrpcGpioService extends PodmanDemoServiceImplBase {

	PiGpio piGpio = PiGpio.newNativeInstance();

	@Override
	public void readGpioState(GpioRequest request, StreamObserver<GpioData> responseObserver) {
		Context pi4j = Pi4J.newContextBuilder().noAutoDetect().add(PiGpioDigitalInputProvider.newInstance(piGpio))
				.build();
		int debouce = request.getDebounceValue() != 0 ? request.getDebounceValue() : 100_000;
		PIN pin = PIN.getValue(request.getPinNo());
//		try {
//			IO io = pi4j.io("BCM" + pin);
//			io.shutdown(pi4j);
//			pi4j.registry().
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		SimpleButton button = new SimpleButton(pi4j, pin, request.getInverted(), debouce);
//		button.onDown(() -> {
//			System.out.println("Touch ID Not touched");
//			responseObserver.onNext(GpioData.newBuilder().setDigitalState(GpioDigitalState.LOW).build());ps q
//		});
		button.onUp(() -> {
			System.out.println("Touch ID touched");
			responseObserver.onNext(GpioData.newBuilder().setDigitalState(GpioDigitalState.HIGH).build());
		});
//		button.whilePressed(() -> {
//			System.out.println("Touch ID touched for 1 sec");
//			responseObserver.onNext(GpioData.newBuilder().setDigitalState(GpioDigitalState.HIGH).build());
//		}, 700);
		while (!io.grpc.Context.current().isCancelled()) {
			sleep(300000);
		}
		button.deRegisterAll();
		pi4j.shutdown();
		responseObserver.onCompleted();
	}

	private void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public StreamObserver<GpioRequest> writeGpioData(StreamObserver<GpioData> responseObserver) {

		return super.writeGpioData(responseObserver);
	}

	@Override
	public StreamObserver<LedStripData> ledStripData(StreamObserver<LedStripData> responseObserver) {

		return new LedStripDataObserver(responseObserver);
	}

}
