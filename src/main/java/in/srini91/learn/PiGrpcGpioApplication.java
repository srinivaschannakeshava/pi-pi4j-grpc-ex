package in.srini91.learn;

import java.io.IOException;

import in.srini91.learn.service.GrpcGpioService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class PiGrpcGpioApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		Server server = ServerBuilder.forPort(6666).addService(new GrpcGpioService()).build();
		server.start();
		server.awaitTermination();
	}

}
