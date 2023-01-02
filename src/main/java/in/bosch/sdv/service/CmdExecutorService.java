package in.bosch.sdv.service;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CmdExecutorService {

//	@Autowired
//	@Qualifier("ServerInstance")
//	private IMqttClient serverMqttClient;

//	@Autowired
//	private MqttConnectionProp mqttConProp;

	public void executeCmd(String cmd) {
		String execResult = null;
		try {
			StringBuilder result = new StringBuilder();
			ProcessBuilder builder = new ProcessBuilder("/bin/bash", "-c", cmd);
			Process process = builder.start();
//			Process process = Runtime.getRuntime().exec(new String[] { System.getenv("SHELL"), "-c", cmd });
//			Process process = Runtime.getRuntime().exec(cmd);
			StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), result);
			Future<?> future = Executors.newSingleThreadExecutor().submit(streamGobbler);
			int exitCode = process.waitFor();
//			assert exitCode == 0;
			future.get();
			execResult = result.toString();
			System.out.println("exec result : " + execResult + ": Exit Code" + exitCode);
		} catch (Exception e) {
			System.out.println("Error- executePodmanCmd " + cmd + ": ERROR " + e.getLocalizedMessage());
		}
	}

}
