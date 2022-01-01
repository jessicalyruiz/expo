package ec.edu.uce.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Demo2Application implements CommandLineRunner{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Demo2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.trace("Se esta iniciando el metodo run");
		LOGGER.trace("Creando instancia de la clase Factura");
		Factura factura = new Factura();
		factura.setNombre("Dennis");
		factura.setApellido("Pilco");
		factura.setCedula(1726868886);
		factura.setCelular(20202020);
		LOGGER.info("Se desea realizar una factura ");
		LOGGER.info("Datos cliente {} ",factura);
		LOGGER.debug("Los datos del cliente no pueden estar vacios");
		if (factura.getCedula() == 0) {
			LOGGER.error("No puede estar vacio el campo de la cedula.");
		}
		if (factura.getCelular() == 0) {
			LOGGER.warn("Es posible que se necesite el numero de celular");
		}
		LOGGER.info("Factura guardada",factura);
		

	}

}
