package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		
		Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> aplicarImposto = numero -> numero >= 2500 ? numero * (1 - 0.085) : numero;

		UnaryOperator<Double> aplicarFrete = numero -> numero >= 3000 ? numero - 100 : numero - 50;
		
		UnaryOperator<Double> arredondar = numero -> {
			BigDecimal bd = new BigDecimal(numero).setScale(2, RoundingMode.HALF_EVEN);
			return bd.doubleValue();
		};
		
		Function<Double, String> formatar = numero -> {
			String numFormatado = numero.toString();
			numFormatado = numFormatado.replace(".", ",");
			return "R$ " + numFormatado;
		};
		
		String resultadoFinal = precoReal
				.andThen(aplicarImposto)
				.andThen(aplicarFrete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println(resultadoFinal);

	}

}
