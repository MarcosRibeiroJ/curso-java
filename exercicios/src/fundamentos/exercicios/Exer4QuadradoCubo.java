package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exer4QuadradoCubo {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero");
		double num = entrada.nextDouble();
		
		double dobro = Math.pow(num, 2);
		double triplo = Math.pow(num, 3);
		
		System.out.println("O dobro do número digitado é: " + dobro);
		System.out.println("O triplo do número digitado é: " + triplo);
		
		entrada.close();

	}

}
