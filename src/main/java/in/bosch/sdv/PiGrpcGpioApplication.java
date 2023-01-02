package in.bosch.sdv;

import java.io.IOException;

import in.bosch.sdv.service.GrpcGpioService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class PiGrpcGpioApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		Server server = ServerBuilder.forPort(6666).addService(new GrpcGpioService()).build();
		server.start();
		server.awaitTermination();
	}

	public static void sleep(int millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
