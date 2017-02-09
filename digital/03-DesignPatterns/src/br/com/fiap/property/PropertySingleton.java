package br.com.fiap.property;

import java.io.IOException;
import java.util.Properties;

public class PropertySingleton {

	private static Properties prop;
	
	// Private Constructor so nobody can instantiate it
	private PropertySingleton() {}
	
	public static Properties getInstance() {
		if (prop == null) {
			prop = new Properties();
			try {
				prop.load(PropertySingleton.class.getResourceAsStream("/config.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return prop;
	}
}