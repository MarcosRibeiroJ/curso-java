package colecoes;

/*
 * Regras de um conjunto SET
 * Pode ser heterogêneo (elementos de tipos misturados dentro do conjunto) embora não seja recomendado usá-lo assim
 * Pode ser homogêneo (todos elementos devem ser do mesmo tipo) melhor forma de utilizar
 * Não aceita elementos duplicados
 * Pode ser ordenado embora por padrão nao seja
 * Não é indexado
 */

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//ADICIONANDO ELEMENTOS NO CONJUNTO
		
		conjunto.add(1.2); //converte tipo primitivo para objeto double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println(conjunto);
		
		//VERIFICANDO TAMANHO DO CONJUNTO
		
		System.out.println("O tamanho da coleção é: " + conjunto.size());
				
		conjunto.add("teste"); //é possível asicionar esse elemento pq teste não é igual a Teste
		
		System.out.println("O tamanho da coleção é: " + conjunto.size());
		
		conjunto.add("Teste"); //não é possível adicionar elementos repetivos na coleção
		System.out.println("O tamanho da coleção é: " + conjunto.size());
		
		//REMOVENDO ELEMENTOS DO CONJUNTO
		//metodo remove retorna true quando consegue remover elemento ou false quando nao consegue
		
		System.out.println(conjunto.remove("teste"));
		System.out.println("O tamanho da coleção é: " + conjunto.size());
		
		//VERIFICANDO SE O CONJUNTO CONTEM UM ELEMENTO ESPECIFICO
		//retorna true quando contem ou false quando nao contem
		
		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto.contains("Teste"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		//UNINDO DOIS CONJUNTOS
		
		//conjunto.addAll(nums); //comentei esse comando para testar a intersecção
		
		System.out.println(conjunto);
		
		//INTERSECÇÃO DE CONJUNTOS
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		//LIMPANDO OS DADOS DO CONJUNTO
		conjunto.clear();
		System.out.println(conjunto);
	}

}
