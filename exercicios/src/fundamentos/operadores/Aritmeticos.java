package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		double x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); //na divisão de números inteiros, o resultado tbm será um número inteiro
		System.out.println(a / (double) b); //fazendo cast para converter um dos valores para double, assim o resultado sairá quebrado
		
		System.out.println(a % b); //resto da divisão de 8 por 3
		
		System.out.println(x + y - a * b);
	}

}
