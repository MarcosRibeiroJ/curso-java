package colecoes;

/*
 * Regras de um conjunto LIST
 * Pode ser heterog�neo (elementos de tipos misturados dentro do conjunto) embora n�o seja recomendado us�-lo assim
 * Pode ser homog�neo (todos elementos devem ser do mesmo tipo) melhor forma de utilizar
 * Aceita elementos duplicados
 * � ordenado
 * � indexado
 */

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		//ADICIONAR ITEMS NA LISTA
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		//o m�todo GET permite imprimir individualmente um elemento de uma lista utilizando seu �ndice
		//essa impress�o ser� feita seguindo o padr�o do m�todo toString definido no objeto Usu�rio que compoe a lista
		System.out.println(lista.get(3));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		//REMOVER ITEMS DA LISTA
		//Nesse caso posso remover usando o �ndice do item ou passando um objeto igual ao que quero remover
		//fazendo isso o metodo remove ir� confrontar os dois objetos usando o equals e o hashcode criados no objeto que representa o item da lista
		
		System.out.println(lista);
		
		lista.remove(1);
		
		System.out.println(lista);
		
		lista.remove(new Usuario("Bia"));
		
		System.out.println(lista);
		
		//PESQUISANDO UM ELEMENTO DENTRO DA LISTA
		
		System.out.println("A lista tem o usu�rio Lia? " + lista.contains(new Usuario("Lia")));
		System.out.println("A lista tem o usu�rio Bia? " + lista.contains(new Usuario("Bia")));
	}

}
