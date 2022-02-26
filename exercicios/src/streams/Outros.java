package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.0);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		//Para descartar elementos repetidos, posso usar o distinct, mas devo implementar o equal e hashcode, caso contrário
		//Ele não irá comparar os elementos, e sim os endereços de memória
		System.out.println("Distinct");
		
		alunos.stream()
			.distinct()
			.forEach(System.out::println);
		
		//Posso utilizar o skip para pular uma qtde N de elementos e o limit para limitar quantos elementos quero
		System.out.println("\nSkip/Limit");
		
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		//Devo tomar cuidado porque a ordem de skip e limit interfere no resultado
		System.out.println("\nLimit/Skip");
				
		alunos.stream()
			.distinct()
			.limit(2)
			.skip(2)
			.forEach(System.out::println);
		
		//Posso pegar elementos enquanto uma condição for verdadeira, utilizando o takewhile
		System.out.println("\nTakeWhile #1");
				
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);	

		//Posso pegar elementos enquanto uma condição for verdadeira, utilizando o takewhile
		System.out.println("\nTakeWhile #2");
		
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);	
	}

}
