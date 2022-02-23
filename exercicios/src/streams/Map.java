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
		
		System.out.println("\n\nUsando composição:");
		marcas.stream()
			.map(Utilitarios.maiuscula) //utilizando a function criada na classe Utilitários
			.map(primeiraLetra)
			.map(Utilitarios::grito) //utilizando a referência ao método static criado na classe Utilitários
			.forEach(print);

	}

}
