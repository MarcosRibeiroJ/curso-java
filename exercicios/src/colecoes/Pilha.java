package colecoes;

/*
 * Estrutura que implementa a l�gica LIFO (last in / first out)
 * Ou seja, o �ltimo a entrar na pilha, ser� o primeiro a sair dela
 * Essa l�gica tamb�m � respeitada ao iterar sobre a pilha
 * Quando utilizar um for, ele ir� percorrer do �ltimo elemento da pilha at� o primeiro
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		//ADICIONAR ELEMENTOS NA PILHA
		
		livros.add("O Pequeno Pr�ncipe"); //retorna false  caso esteja usando uma pilha com limite de tamanho e tente adicionar um elemento ap�s preencher todo espa�o da pilha
		livros.push("Don Quixote"); //retorna um erro caso esteja usando uma pilha com limite de tamanho e tente adicionar um elemento ap�s preencher todo espa�o da pilha
		livros.push("O Hobbit");
		
		//ITERAR A PILHA USANDO FOREACH
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		//SELECIONAR ELEMENTOS DA PILHA SEM REMOVER
		
		System.out.println(livros.peek()); //retorna o pr�ximo elemento da pilha mas n�o o remove ou null caso a pilha esteja vazia
		System.out.println(livros.peek());
		System.out.println(livros.element()); //retorna o pr�ximo elemento da pilha mas n�o o remove ou erro caso a pilha esteja vazia
				
		//SELECIONAR ELEMENTOS DA PILHA REMOVENDO
				
		System.out.println(livros.poll()); //retorna o pr�ximo elemento da pilha e j� o remove ou null caso a pilha esteja vazia
		System.out.println(livros.remove()); //retorna o pr�ximo elemento da pilha e j� o remove ou erro caso a pilha esteja vazia
		System.out.println(livros.pop()); //retorna o pr�ximo elemento da pilha e j� o remove ou erro caso a pilha esteja vazia
		
		//M�TODOS COMUNS DA PILHA
		
//		livros.size();
//		livros.clear();
//		livros.contains();
//		livros.isEmpty();
	}

}
