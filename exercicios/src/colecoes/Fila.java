package colecoes;

/*
 * Estrutura que implementa a l�gica FIFO (first in/ first out)
 * Ou seja, o primeiro que entra na fila � o primeiro que sair� dela
 * Essa l�gica tamb�m � utilizada quando iterar sobre a fila
 * Nesse caso, ao utilizar um for na fila, ele percorrer� do primeiro elemento adicionado at� o �ltimo
 */

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//ADICIONAR ELEMENTOS NA FILA
		
		fila.add("Ana"); //retorna um erro caso esteja usando uma fila com limite de tamanho e tente adicionar um elemento ap�s preencher todo espa�o da fila
		fila.offer("Bia"); //retorna false  caso esteja usando uma fila com limite de tamanho e tente adicionar um elemento ap�s preencher todo espa�o da fila
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		//SELECIONAR ELEMENTOS DA FILA SEM REMOVER
		
		System.out.println(fila.peek()); //retorna o pr�ximo elemento da fila mas n�o o remove ou null caso a fila esteja vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //retorna o pr�ximo elemento da fila mas n�o o remove ou erro caso a fila esteja vazia
		
		//SELECIONAR ELEMENTOS DA FILA REMOVENDO
		
		System.out.println(fila.poll()); //retorna o pr�ximo elemento da fila e j� o remove ou null caso a fila esteja vazia
		System.out.println(fila.remove()); //retorna o pr�ximo elemento da fila e j� o remove ou erro caso a fila esteja vazia
		
		//M�TODOS COMUNS DE SEREM UTILIZADOS
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
	}

}
