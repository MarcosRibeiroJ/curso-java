package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
	void adicionarItem(String nomeProduto, double preco, int quantidade) {
		this.adicionarItem(new Item(nomeProduto, preco, quantidade));
	}
	
	double obterValorTotal() {
		double totalCompra = 0;
		for(Item item: itens) {
			totalCompra += item.quantidade * item.produto.preco;
		}
		return totalCompra;
	}
}
