package br.com.fiap.loja.config;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertySingleton {
	private static Logger log = LoggerFactory.getLogger(PropertySingleton.class);
	private static Properties prop;
	
	private PropertySingleton() {
		
	}
	
	public static Properties getInstance(){
		if (prop == null){
			log.info("Loading properties...");
			prop = new Properties();
			
			try{
				prop.load(PropertySingleton.class.getResourceAsStream("/loja.properties"));
				log.info("Property 'loja' loaded.");
			}catch (IOException e){
				log.error("Property 'loja' not found.");
				e.printStackTrace();
			}
		}
		return prop;
	}
}