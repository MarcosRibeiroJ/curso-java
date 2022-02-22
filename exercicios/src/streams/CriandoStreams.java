package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		//Criando uma variável print que recebe uma referência ao método print, nesse caso toda vez que eu precisar utilizar
		//o método System.out.print, basta utilizar a variável print
		Consumer<String> print = System.out::print;
//		Consumer<Integer> println = System.out::println;
		
		
		//Criando uma Stream de Strings utilizando o método estático Stream.of e passando os valores literais
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		
		//Nesse caso estou utilizando diretamente o metodo of para criar a stream e passando um array de strings para ele
		Stream.of(maisLangs).forEach(print);
		
		//Criando a partir do método stream do Arrays
		Arrays.stream(maisLangs).forEach(print);
		
		//Criando um subconjunto a partir da stream, nesse caso ele extrai o elemento de índice 1 e 2, o 3 não é incluido
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		System.out.println();
		
		//Criando stream a partir de uma colection
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);//nesse caso o processamento da stream ocorre de forma paralela
		
		//Greando stream infinita sem ordenação
		//O generate recebe uma lambda sem parametro e deve retornar algum valor
		//Stream.generate(() -> "a").forEach(print);
		
		//Gerando uma stream infinita mas ordenada
		//O iterate exige um seed que seria um parametro de start e em seguida qual será o criterio de iteração
//		Stream.iterate(0, n -> n + 1).forEach(println);

	}

}
