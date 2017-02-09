package br.com.fiap.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TerminalConsulta {
	public static void main(String[] args) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("FIAP                      " + formatador.format(Calendar.getInstance().getTime()));
		System.out.println("------------------------------------");
	}
}
