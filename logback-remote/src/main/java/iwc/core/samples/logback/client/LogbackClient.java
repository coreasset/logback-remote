package iwc.core.samples.logback.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackClient {
	private static final Logger logger = LoggerFactory.getLogger("MLS_LOGGER");

	public static void main(String[] args) {
//		logger.trace("trace");
//        logger.debug("debug");
//        logger.info("info");
//        logger.warn("warn");
//        logger.error("error");
		callClient("client1", "test1");
//		callClient("client2", "test2");
//		callClient("client3", "test3");
	}
	
	public static void callClient(String clientName, String message) {
		logger.info("info = " + clientName + " : " + message);
		logger.warn("warn = " + clientName + " : " + message);
		logger.error("error = " + clientName + " : " + message);
	}
}
