package br.com.fiap.loja.bo;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.loja.to.ProdutoTO;

public class EstoqueBO {
	private Map<Integer, ProdutoTO> banco;
	
	public EstoqueBO() {
		banco = new HashMap<>();
		banco.put(401, new ProdutoTO(401, "Camiseta Manga Larga", 19.9, 5));
		banco.put(402, new ProdutoTO(402, "Camiseta Manga Curta", 14.9, 7));
	}
	
	public ProdutoTO consultarProduto (int codigo) {
		return banco.get(codigo);
	}
}
