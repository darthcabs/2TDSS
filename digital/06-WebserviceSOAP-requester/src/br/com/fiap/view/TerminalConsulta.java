package br.com.fiap.view;

import br.com.fiap.bo.DisciplinaBOStub;
import br.com.fiap.bo.DisciplinaBOStub.CalcularMedia;
import br.com.fiap.bo.DisciplinaBOStub.CalcularMediaResponse;

public class TerminalConsulta {
	public static void main(String[] args) {
		try {
			DisciplinaBOStub bo = new DisciplinaBOStub();
			CalcularMedia valores = new CalcularMedia();
			valores.setAm(7.5f);
			valores.setNac(9);
			valores.setPs(6);
			
			CalcularMediaResponse response = bo.calcularMedia(valores);
			
			double media = response.get_return();
			System.out.println("Média: " + media);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
