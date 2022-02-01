package controle.exercicios;

import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maiorNumero = 0;

		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			int numDigitado = entrada.nextInt();
			if(maiorNumero <= numDigitado) {
				maiorNumero = numDigitado;
			}
		}
		entrada.close();
		
		System.out.println("O maior número digitado é: " + maiorNumero);
	}

}
