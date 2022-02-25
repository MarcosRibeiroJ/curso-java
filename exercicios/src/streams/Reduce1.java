package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);
		
		// Utilizando uma stream paralela, para cada chamada a um elemento da stream
		// o java irá acrescentar o valor inicial a soma

		Integer total3 = nums.parallelStream().reduce(100, soma);
		System.out.println(total3);
		
		
		//Resultado foi um Optional<Integer> e isso permitiu o uso mo método ifPresent
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}

}
