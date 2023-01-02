package in.bosch.sdv.service;

import com.pi4j.context.Context;
import com.pi4j.library.pigpio.PiGpio;

import in.bosch.sdv.pi4j.catalog.components.SimpleButton;
import in.bosch.sdv.pi4j.catalog.components.helpers.PIN;
import in.bosch.sdv.proto.models.GpioData;
import in.bosch.sdv.proto.models.GpioDigitalState;
import in.bosch.sdv.proto.models.GpioRequest;
import in.bosch.sdv.proto.models.LedStripData;
import in.bosch.sdv.proto.models.Status;
import in.bosch.sdv.proto.models.UartData;
import in.bosch.sdv.service.observers.LedStripDataObserver;
import in.bosch.sdv.service.observers.UartDataObserver;
import in.srini91.learn.proto.models.PodmanDemoServiceGrpc.PodmanDemoServiceImplBase;
import io.grpc.stub.StreamObserver;

public class GrpcGpioService extends PodmanDemoServiceImplBase {

	PiGpio piGpio = PiGpio.newNativeInstance();

	@Override
	public void readGpioState(GpioRequest request, StreamObserver<GpioData> responseObserver) {
		Context pi4j = Pi4jInstanceProvider.getPi4jTouchContext();
		int debouce = request.getDebounceValue() != 0 ? request.getDebounceValue() : 1000_000;
		PIN pin = PIN.getValue(request.getPinNo());
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

	@Override
	public StreamObserver<UartData> uartWriteData(StreamObserver<Status> responseObserver) {
		return new UartDataObserver(responseObserver);
	}
}
