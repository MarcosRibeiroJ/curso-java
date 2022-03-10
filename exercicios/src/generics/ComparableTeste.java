package generics;

/**
 * Classe criada apenas para mostrar que o TreeSet � uma cole��o que j� ordena seus elementos por algum crit�rio
 * Nesse caso como utilizamos o Integer como tipo de dado, essa classe j� possue um m�todo compareTo que consegue
 * comparar dois valores e definir qual � maior ou menor
 */

import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(9);
		nums.add(123);
		nums.add(-13);
		
		for(Integer n : nums) {
			System.out.println(n);
		}

	}

}
