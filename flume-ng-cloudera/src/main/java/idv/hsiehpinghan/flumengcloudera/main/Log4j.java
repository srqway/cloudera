package idv.hsiehpinghan.flumengcloudera.main;

import org.apache.log4j.Logger;

public class Log4j {
	private static final Logger LOGGER = Logger.getLogger(Log4j.class);

	public static void main(String[] args) {
		LOGGER.info("flume log4j appender test.");
	}
}
