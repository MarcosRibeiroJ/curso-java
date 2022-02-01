package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		//declarando variavel com tipo de dado
		double x = 1.5;
		System.out.println(x);
		
		//tentando atribuir um tipo de dado diferente do declarado
		// x = "a"; isso gera um erro
		
		//declarando variavel sem o tipo
		var y = 1;
		System.out.println(y);
		
		//y = "a"; tambem gera erro pq o java vai inferir que a variavel é do tipo inteiro, sendo assim, não é possível atribuir um texto
		

	}

}
