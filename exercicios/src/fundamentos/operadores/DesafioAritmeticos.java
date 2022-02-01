package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		System.out.println(b);
		
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 5;
//		int e = 6;
//		int f = 7;
//		int g = 10;
//		
//		int primeiraEquacao = (int) Math.pow(e * (c + b),b) / (c * b);
//		int segundaEquacao = (int) Math.pow((a - d) * (b - f) / b, b);
//		int resultado = (int) Math.pow(primeiraEquacao - segundaEquacao, c) / (int) Math.pow(g,c);
//		
//		System.out.println(primeiraEquacao);
//		System.out.println(segundaEquacao);
//		System.out.println(resultado);
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA -  superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println(resultado);

	}

}
