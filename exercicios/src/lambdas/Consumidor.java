package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		/* Criando uma interface Consumer com nome imprimirNome
		 * Essa interface recebe um objeto e nao retorna nada
		 * Defini que a lambda ter� um parametro e o consumer recebr� um produto
		 * A fun�ao dever� imprimir o nome do produto
		 */
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!"); 
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1); //acessando o consumer e chamando o m�todo accept que executar� a lambda definida na linha 16
		
		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.80, 0.18);
		Produto p5 = new Produto("L�pis", 4.39, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5); //criando uma lista de produtos
		
		/* Utilizando o foreach para receber a interface consumer
		 * Automaticamente ser� executado o accept passando como par�metro cada produto da lista	
		 */
		produtos.forEach(imprimirNome);
		
		/* Tamb�m posso passar para o foreach uma lambda
		 * O foreach por padr�o recebe um Consumer
		 * Como por defini��o o consumir � um fun��o que tem apenas um parametro e n�o retorna nada
		 * Eu posso definir diretamente essa lambda 
		 */
		produtos.forEach(p -> System.out.println(p.preco));
		
		/* Nesse exemplo estou passando o println por refer�ncia para cada elemento da lista produtos
		 * Nesse caso ele ir� executar o m�todo toString do objeto
		 */
		produtos.forEach(System.out::println);
	}
}
