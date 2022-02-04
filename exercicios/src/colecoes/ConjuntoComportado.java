package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new HashSet<>(); cria um conjunto sem ordenação
		SortedSet<String> listaAprovados = new TreeSet<>(); //cria um conjunto e realiza uma ordenação, nesse exemplo por ordem alfabetica
		
		listaAprovados.add("Carlos");
		listaAprovados.add("Ana");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(120);
		numeros.add(6);
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
	}

}
