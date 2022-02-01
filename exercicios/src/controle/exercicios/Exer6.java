package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeroDeTentativas = 10;
		
		Random rdm = new Random();
		
		int numeroSecreto = rdm.nextInt(101);
		
		System.out.println("Jogo da adivinhação");
		System.out.println("O número secreto está entre 0 e 100");
		System.out.printf("Você tem %d tentativas de acertar. Boa sorte!\n", numeroDeTentativas);
		
		do {
			System.out.print("Por favor digite um número:");
			int numeroDigitado = entrada.nextInt();
			
			if(numeroSecreto == numeroDigitado) {
				System.out.println("Parabéns você acertou!");
				break;
			} else if(numeroSecreto > numeroDigitado) {
				numeroDeTentativas--;
				System.out.println("Errou! O número secreto é MAIOR que o número digitado");
				System.out.printf("Tentativas restantes: %d\n\n", numeroDeTentativas);
			} else {
				numeroDeTentativas--;
				System.out.println("Errou! O número secreto é MENOR que o número digitado");
				System.out.printf("Tentativas restantes: %d\n\n", numeroDeTentativas);
			}
		} while(numeroDeTentativas > 0 && numeroDeTentativas <= 10);
		
		System.out.println("Fim");
		
		

		entrada.close();

	}

}
