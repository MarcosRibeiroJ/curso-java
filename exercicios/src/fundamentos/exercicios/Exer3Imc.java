package fundamentos.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Exer3Imc {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		double peso = entrada.nextDouble();
		System.out.println("Digite sua altura:");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2.0);
		
		System.out.printf("Seu IMC é: %.2f", imc);
		
		entrada.close();
	}
}
