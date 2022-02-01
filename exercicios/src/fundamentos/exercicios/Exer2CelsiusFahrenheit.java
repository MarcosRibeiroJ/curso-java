package fundamentos.exercicios;

import java.util.Scanner;

public class Exer2CelsiusFahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius:");
		double tempc = entrada.nextDouble();
		
		double tempf = tempc * 1.8 + 32;
		
		System.out.println("A temperatura em Fahrenheit é: " + tempf);
		
		entrada.close();

	}

}
