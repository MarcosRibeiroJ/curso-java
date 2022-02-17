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
		 * Nesse caso, estou implementando um fun��o lambda, que seria armazenar um m�todo dentro de uma variavel
		 * Esse m�todo est� sendo sobrescrito de uma interface
		 * Eu posso criar uma fun��o lambda usando chaves e nesse caso devo escrever um return da fun��o (usado na linha 7)
		 * Ou apenas uma sentan�a que seria o comportamento do m�todo (usado na linha 10)
		 * Esse comportamento � muito semelhante as arrow functions do javascript
		 * Tamb�m estou imprimindo o resultado de um m�todo default da instancia calculo
		 * E o resultado de um m�todo static da interface Calculo
		 */

	}

}
