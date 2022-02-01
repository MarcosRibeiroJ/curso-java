package fundamentos.exercicios;

import java.util.Scanner;

public class Exer1FahrenheitCelsius {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		double tempf = entrada.nextDouble();
		
		double tempc = (tempf - 32) / 1.8;
		
		System.out.println("A temperatura em Celsius é: " + tempc);
		
		entrada.close();

	}

}
