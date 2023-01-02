package in.bosch.sdv.service.observers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import in.bosch.sdv.proto.models.Status;
import in.bosch.sdv.proto.models.UartData;
import in.bosch.sdv.service.CmdExecutorService;
import io.grpc.stub.StreamObserver;

public class UartDataObserver implements StreamObserver<UartData> {
//	private Serial pi4jSerial;
	private StreamObserver<Status> responseObserver;
	ExecutorService pool = Executors.newFixedThreadPool(1);
	CmdExecutorService cmd = new CmdExecutorService();

	public UartDataObserver(StreamObserver<Status> responseObserver) {
		try {
			this.responseObserver = responseObserver;
			System.out.println("creating UART DATA Observer");
//			this.pi4jSerial = Pi4jInstanceProvider.getUARTSerialContext();
			System.out.println("creating UART DATA Observer");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onNext(UartData value) {
		cmd.executeCmd("stty -F /dev/ttyS0 9600; echo \"" + value.getData() + "\" > /dev/ttyS0");
//		Runnable run = () -> {
//		if (this.pi4jSerial.isOpen()) {
//			this.pi4jSerial.write(value.getData());
//			this.pi4jSerial.write('\n');
//		} else {
//			System.out.println("Serial Port Not opened!!!");
//		}
//		PiGrpcGpioApplication.sleep(250);
//			serial.drain();
//		};
//		pool.execute(run);
//		run.run();
//		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(serial.getOutputStream());) {
//			bufferedOutputStream.write(value.getData().getBytes());
//			bufferedOutputStream.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

	@Override
	public void onError(Throwable t) {

	}

	@Override
	public void onCompleted() {
		responseObserver.onNext(Status.newBuilder().setStatus(true).build());
		responseObserver.onCompleted();

	}

}
