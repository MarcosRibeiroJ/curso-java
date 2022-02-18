package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		
		System.out.println(isCaro.test(produto));
		
		/*
		 * Estou usando uma interface funcional
		 * Nesse exemplo o Predicate que é uma interface que recebe um objeto por parâmetro, posso atribuir uma função lambda
		 * E o retorno será um boolean
		 */

	}

}
