package in.bosch.sdv.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamGobbler implements Runnable {
	private InputStream inputStream;
	private StringBuilder consumer;

	public StreamGobbler(InputStream inputStream, StringBuilder consumer) {
		this.inputStream = inputStream;
		this.consumer = consumer;
	}

	@Override
	public void run() {
		new BufferedReader(new InputStreamReader(inputStream)).lines().forEach(consumer::append);
	}
}