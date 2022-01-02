package ec.edu.uce.all.off;



//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.*;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrabajogrupalApplication implements CommandLineRunner {
	
	private static final Logger LOG = LoggerFactory.getLogger(TrabajogrupalApplication.class);
	
	
	//private static final Log LOG1= LogFactory.getLog(TrabajogrupalApplication.class);
	
	//private static final Logger LOG2= LogManager.getLogger(TrabajogrupalApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TrabajogrupalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		LOG.info("Ejemplo con slf4j");
		//LOG.error("Division para 0");
		
		//LOG1.info("Ejemplo con Apache Commons Logging");
		
	
	
		
		
		
		
	}

}
