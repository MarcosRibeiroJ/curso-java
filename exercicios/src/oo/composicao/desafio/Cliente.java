package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nomeCliente;
	final List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	void comprar(Compra compra) {
		this.compras.add(compra);
	}
	
	double verTotalCompras() {
		double totalCompras = 0;
		for(Compra compra: compras) {
			totalCompras += compra.obterValorTotal();
		}
		return totalCompras;
	}
}
