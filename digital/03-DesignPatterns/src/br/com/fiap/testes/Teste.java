package br.com.fiap.testes;

import br.com.fiap.property.PropertySingleton;

public class Teste {
	public static void main(String[] args) {
		System.out.println("System language: Portuguese (Brazil)");
		System.out.println("\n" + PropertySingleton.getInstance().getProperty("welcome"));
	}
}
