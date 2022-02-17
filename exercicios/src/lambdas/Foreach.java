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
		
		System.out.println("\nMethod Reference:");
		aprovados.forEach(System.out::println);
	}

}
