package controle.exercicios;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		int contadorDivisores = 0;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				contadorDivisores++;
			}
		}
		
		if(contadorDivisores == 0) {
			System.out.println("O número digitado é um número primo");
		} else {
			System.out.println("O número digitado NÃO é um número primo");
		}
		

		entrada.close();

	}

}
