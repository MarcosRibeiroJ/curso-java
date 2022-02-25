package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado)); //verifica se todos elementos da stream estão de acordo com o predicado criado
		System.out.println(alunos.stream().anyMatch(aprovado)); //verifica se algum elemento da stream está de acordo com o predicado criado
		System.out.println(alunos.stream().noneMatch(reprovado)); //verifica se nenhum dos elementos da stream está de acordo com o predicado criado
	}

}
