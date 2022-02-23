package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Consumer<Object> println = System.out::println;
		
		/*
		 * 1. Converter o número para uma string binária: 6 => "110"
		 * 2. Inverter a string: "110" => "011"
		 * 3. Converter de volta para inteiro: "011" => 3
		 */
		
		Function<Integer, String> converterIntParaString = n -> Integer.toBinaryString(n);
		
		UnaryOperator<String> inverterString = s -> new StringBuilder(s).reverse().toString();
		
		Function<String, Integer> converterStringParaInt = s -> Integer.parseInt(s, 2);
		
		nums.stream()
			.map(converterIntParaString)
			.map(inverterString)
			.map(converterStringParaInt)
			.forEach(println);
		
		

	}

}
