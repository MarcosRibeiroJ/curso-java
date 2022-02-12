package oo.composicao.desafio;

public class Item {
	
	final Produto produto;
	final int quantidade;
	
	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	Item(String nomeProduto, double preco, int quantidade) {
		this.produto = new Produto(nomeProduto, preco);
		this.quantidade = quantidade;
	}

}
