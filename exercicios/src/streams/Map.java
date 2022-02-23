package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ","Audi ", "Honda ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		
		System.out.println("\n\nUsando composi��o:");
		marcas.stream()
			.map(Utilitarios.maiuscula) //utilizando a function criada na classe Utilit�rios
			.map(primeiraLetra)
			.map(Utilitarios::grito) //utilizando a refer�ncia ao m�todo static criado na classe Utilit�rios
			.forEach(print);

	}

}
