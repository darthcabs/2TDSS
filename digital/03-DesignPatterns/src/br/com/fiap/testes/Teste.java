package br.com.fiap.testes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fiap.property.PropertySingleton;

public class Teste {
	private static Logger log = LoggerFactory.getLogger(PropertySingleton.class);
	
	public static void main(String[] args) {
		log.info("Setting language as Portuguese Brazil");
		System.out.println("System language: Portuguese (Brazil)");
		System.out.println("\n" + PropertySingleton.getInstance().getProperty("welcome"));
	}
}