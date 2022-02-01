package fundamentos.exercicios;
import java.util.Scanner;

public class Exer6Delta {

	public static void main(String[] args) {
		double a, b, c, delta;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de a:");
		a = entrada.nextDouble();
		System.out.println("Digite o valor de b:");
		b = entrada.nextDouble();
		System.out.println("Digite o valor de c:");
		c = entrada.nextDouble();
		
		entrada.close();

		System.out.printf("Equação (%.0f)X^2 + (%.0f)X + (%.0f)", a, b, c);
		
		delta = Math.pow(b, 2) -4 * (a * c);
		
		System.out.println("\nResultado do delta: " + delta);
	}

}
