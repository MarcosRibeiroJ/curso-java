package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional de ForEach:");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nForma lambda 01:");
		
//		aprovados.forEach((nome) -> { System.out.println(nome + "!!!"); }); // vers�o completa
//		aprovados.forEach(nome -> { System.out.println(nome + "!!!"); }); // n�o preciso de parenteses quando tenho apenas um parametro
		aprovados.forEach(nome -> System.out.println(nome + "!!!")); // como s� tenho uma instru��o, n�o preciso das chaves 

		/*
		 * No exemplo de Method Reference, estou passando cada item percorrido da lista
		 * como um par�metro para o m�todo println atrav�s de uma refer�ncia ao m�todo
		 */
		
		System.out.println("\nMethod Reference 01:");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nForma Lambda 02:");
		aprovados.forEach(nome -> meuImprimir(nome)); // express�o lambda que chama o m�todo definido na classe 
		
		System.out.println("\nMethod Reference 02:");
		aprovados.forEach(Foreach::meuImprimir); // refer�ncia ao m�todo meuImprimir definido na classe Foreach
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome � " + nome);
	}

}
