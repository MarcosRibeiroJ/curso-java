package controle.exercicios;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int total = 0;
		
		do {
			System.out.print("Digite um número inteiro positivo pra somar ou negativo para sair: ");
			num = entrada.nextInt();
			
			if(num >= 0) {
				total += num;
				System.out.println("Valor total é: " + total);
			}
		} while(num >= 0);

		entrada.close();

	}

}
