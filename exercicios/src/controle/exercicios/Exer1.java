package controle.exercicios;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número de 0 a 10: ");
		int num = entrada.nextInt();
		
		if(num >= 0 && num <= 10 && num % 2 == 0) {
			System.out.println("Esse é um número válido par");
		} else if(num >= 0 && num <= 10 && num % 2 == 1) {
			System.out.println("Esse é um número válido ímpar");
		} else {
			System.out.println("Número inválido");
		}

		entrada.close();
	}

}
