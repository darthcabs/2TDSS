package br.com.fiap.userui;

import java.util.Scanner;

import org.apache.axis2.AxisFault;

import com.fiap.inventario.EstoqueBOStub;
import com.fiap.inventario.EstoqueBOStub.ConsultarProduto;
import com.fiap.inventario.EstoqueBOStub.ConsultarProdutoResponse;
import com.fiap.inventario.EstoqueBOStub.ProdutoTO;

public class UserUI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do produto: ");
		int cod = sc.nextInt();
		
		sc.close();
		
		try {
			EstoqueBOStub stub = new EstoqueBOStub();
			ConsultarProduto parameters = new ConsultarProduto();
			parameters.setCodigo(cod);
			ConsultarProdutoResponse resp = stub.consultarProduto(parameters);
			ProdutoTO produto = resp.get_return();
			System.out.println("\nProduto: " + produto.getDescricao() + 
					"\nCódigo: " + produto.getCodigo() + " | Valor: " + produto.getPreco() + 
					" | Qtd: " + produto.getQuantidade());
		}catch (AxisFault a) {
			System.out.println(a.getMessage());
		} catch (Exception e) {
			System.out.println("Erro geral.");
		}
	}
}