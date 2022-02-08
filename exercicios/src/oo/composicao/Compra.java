package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	Item item;
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		
		double totalCompra = 0;
		for(Item item: itens) {
			totalCompra += item.preco * item.quantidade;
		}
		
		return totalCompra;
	}

}
