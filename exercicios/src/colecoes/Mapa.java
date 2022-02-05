package colecoes;

/*
 * Estrutura chave/valor
 * Chave não aceita repetição
 * Valor aceita repetição
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//ADICIONAR ELEMENTOS NO MAP
		
		//O método put adiciona caso o elemento não exista ou substitue caso eu tente inserir um elemento com a mesma chave
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		//MÉTODOS COMUNS DE SEREM USADOS COM MAP
		
		System.out.println(usuarios.size()); //tamanho do map
		System.out.println(usuarios.isEmpty()); //verifica se está vazio
		System.out.println(usuarios.keySet()); //retorna o conjunto das chaves
		System.out.println(usuarios.values()); //retorna o conjunto de valores
		System.out.println(usuarios.entrySet()); //retorna o conjunto completo, chave e valor
		
		//PESQUISAR NO MAP
		
		System.out.println(usuarios.containsKey(3)); //retorna true ou false caso encontre ou nao um elemento com a chave pesquisada
		System.out.println(usuarios.containsValue("Rebeca")); //retorna true ou false caso encontre ou nao um elemento com o valor pesquisado
		System.out.println(usuarios.get(2)); //retorna o valor a partir de uma chave
		
		//ITERAR NUM MAP
		
		//ITERAR PELA CHAVE
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//ITERAR PELO VALOR
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//ITERAR PELA CHAVE/VALOR
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
		
		//REMOVER ELEMENTOS DO MAP
		
		System.out.println(usuarios.remove(1)); //se encontrar uma chave correspondente remove o elemento
		System.out.println(usuarios.remove(2, "Ricardo")); //se encontrar um conjunto chave/valor correspondente remove o elemento

	}

}
