package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3500, 0.10, true);
		Produto p2 = new Produto("Mouse", 10, 0, false);
		Produto p3 = new Produto("Teclado", 100, 0, false);
		Produto p4 = new Produto("HD", 1500, 0.30, false);
		Produto p5 = new Produto("Cadeira", 2500, 0.35, true);
		Produto p6 = new Produto("Mesa", 2000, 0.30, true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> verificarDesconto = p -> p.desconto >= 0.3;
		Predicate<Produto> verificarFrete = p -> p.freteGratis;
		
		Function<Produto, String> imprimirProduto = p -> p.nome + " R$ " + p.preco;
		
		produtos.stream()
			.filter(verificarDesconto)
			.filter(verificarFrete)
			.map(imprimirProduto)
			.forEach(System.out::println);
	}

}
