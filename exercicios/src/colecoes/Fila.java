package colecoes;

/*
 * Estrutura que implementa a lógica FIFO (first in/ first out)
 * Ou seja, o primeiro que entra na fila é o primeiro que sairá dela
 * Essa lógica também é utilizada quando iterar sobre a fila
 * Nesse caso, ao utilizar um for na fila, ele percorrerá do primeiro elemento adicionado até o último
 */

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//ADICIONAR ELEMENTOS NA FILA
		
		fila.add("Ana"); //retorna um erro caso esteja usando uma fila com limite de tamanho e tente adicionar um elemento após preencher todo espaço da fila
		fila.offer("Bia"); //retorna false  caso esteja usando uma fila com limite de tamanho e tente adicionar um elemento após preencher todo espaço da fila
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		//SELECIONAR ELEMENTOS DA FILA SEM REMOVER
		
		System.out.println(fila.peek()); //retorna o próximo elemento da fila mas não o remove ou null caso a fila esteja vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //retorna o próximo elemento da fila mas não o remove ou erro caso a fila esteja vazia
		
		//SELECIONAR ELEMENTOS DA FILA REMOVENDO
		
		System.out.println(fila.poll()); //retorna o próximo elemento da fila e já o remove ou null caso a fila esteja vazia
		System.out.println(fila.remove()); //retorna o próximo elemento da fila e já o remove ou erro caso a fila esteja vazia
		
		//MÉTODOS COMUNS DE SEREM UTILIZADOS
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
	}

}
