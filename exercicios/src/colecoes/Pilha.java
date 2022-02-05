package colecoes;

/*
 * Estrutura que implementa a lógica LIFO (last in / first out)
 * Ou seja, o último a entrar na pilha, será o primeiro a sair dela
 * Essa lógica também é respeitada ao iterar sobre a pilha
 * Quando utilizar um for, ele irá percorrer do último elemento da pilha até o primeiro
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		//ADICIONAR ELEMENTOS NA PILHA
		
		livros.add("O Pequeno Príncipe"); //retorna false  caso esteja usando uma pilha com limite de tamanho e tente adicionar um elemento após preencher todo espaço da pilha
		livros.push("Don Quixote"); //retorna um erro caso esteja usando uma pilha com limite de tamanho e tente adicionar um elemento após preencher todo espaço da pilha
		livros.push("O Hobbit");
		
		//ITERAR A PILHA USANDO FOREACH
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		//SELECIONAR ELEMENTOS DA PILHA SEM REMOVER
		
		System.out.println(livros.peek()); //retorna o próximo elemento da pilha mas não o remove ou null caso a pilha esteja vazia
		System.out.println(livros.peek());
		System.out.println(livros.element()); //retorna o próximo elemento da pilha mas não o remove ou erro caso a pilha esteja vazia
				
		//SELECIONAR ELEMENTOS DA PILHA REMOVENDO
				
		System.out.println(livros.poll()); //retorna o próximo elemento da pilha e já o remove ou null caso a pilha esteja vazia
		System.out.println(livros.remove()); //retorna o próximo elemento da pilha e já o remove ou erro caso a pilha esteja vazia
		System.out.println(livros.pop()); //retorna o próximo elemento da pilha e já o remove ou erro caso a pilha esteja vazia
		
		//MÉTODOS COMUNS DA PILHA
		
//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty();
	}

}
