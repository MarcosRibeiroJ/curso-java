package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		Calculo calculo = (x, y) -> { return x + y; };
		System.out.println(calculo.executar(2, 3));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(2, 3));
		
		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal());
		
		/*
		 * Nesse caso, estou implementando um função lambda, que seria armazenar um método dentro de uma variavel
		 * Esse método está sendo sobrescrito de uma interface
		 * Eu posso criar uma função lambda usando chaves e nesse caso devo escrever um return da função (usado na linha 7)
		 * Ou apenas uma sentança que seria o comportamento do método (usado na linha 10)
		 * Esse comportamento é muito semelhante as arrow functions do javascript
		 * Também estou imprimindo o resultado de um método default da instancia calculo
		 * E o resultado de um método static da interface Calculo
		 */

	}

}
