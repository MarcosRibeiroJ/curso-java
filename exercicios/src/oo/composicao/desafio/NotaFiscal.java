package oo.composicao.desafio;

public class NotaFiscal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Marcos Ribeiro");
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.adicionarItem("Pão Integral", 5.50, 2);
		compra1.adicionarItem("Pizza", 11, 3);
		
		compra2.adicionarItem("Bolacha", 2.50, 1);
		compra2.adicionarItem("Leite", 3.50, 2);
		
		cliente1.comprar(compra1);
		cliente1.comprar(compra2);
		
		System.out.println("O total da primeira compra é: " + compra1.obterValorTotal());
		System.out.println("O total da segunda compra é: " + compra2.obterValorTotal());
		System.out.printf("O cliente %s gastou %.2f com suas compras", cliente1.nomeCliente, cliente1.verTotalCompras());

	}

}
