package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		var p2 = new Produto();
		
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		
		double precoFinal1 = p1.precoComDesconto(0.1);
		double precoFinal2 = p2.precoComDesconto();
		double totalCompra = precoFinal1 + precoFinal2;
		
		System.out.printf("O total da compra é R$ %.2f", totalCompra);

	}

}
