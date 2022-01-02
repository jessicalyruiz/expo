package ec.edu.uce;


import org.apache.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpoApplication {

	private static Logger LOG=Logger.getLogger(ExpoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ExpoApplication.class, args);
		LOG.debug("hello debug");
		LOG.info("**********hello info ");
		LOG.warn("hello warn");
		LOG.error("hello error");
		LOG.fatal("hello fatal");
		
	}

}
