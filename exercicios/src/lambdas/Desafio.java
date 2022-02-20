package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		
		Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> aplicarImposto = preco -> preco >= 2500 ? preco * 1.085 : preco;

		UnaryOperator<Double> aplicarFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".", ",");
		
		String resultadoFinal = precoReal
				.andThen(aplicarImposto)
				.andThen(aplicarFrete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(resultadoFinal);

	}

}
