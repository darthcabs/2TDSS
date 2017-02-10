package br.com.fiap.testes;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotations.Coluna;
import br.com.fiap.bean.Animal;

public class Teste {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		//Recuperar atributos da classe Animal
		Field[] atributos = animal.getClass().getDeclaredFields();
		
		for (Field field : atributos) {
			Coluna anotacao = field.getAnnotation(Coluna.class);
			System.out.println("\nAtributo: " + field.getName() + "\nColuna: " + anotacao.nome());
		}
		
		System.out.println();

		//Recuperar m�todos da classe Animal
		Method[] m�todos = animal.getClass().getDeclaredMethods();
		
		for (Method method : m�todos) {
			System.out.println("M�todo: " + method.getName());
		}
	}
}