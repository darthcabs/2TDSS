package br.com.fiap.property;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertySingleton {
	private static Logger log = LoggerFactory.getLogger(PropertySingleton.class);

	private static Properties prop;
	
	// Private Constructor so nobody can instantiate it
	private PropertySingleton() {}
	
	public static Properties getInstance() {
		if (prop == null) {
			log.info("Instanciando as Properties");
			prop = new Properties();
			try {
				prop.load(PropertySingleton.class.getResourceAsStream("/config.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		log.debug("Lendo uma propriedade do PropertySingleton");
		return prop;
	}
}