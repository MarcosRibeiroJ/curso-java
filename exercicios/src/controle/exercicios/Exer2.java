package controle.exercicios;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um ano: ");
		int ano = entrada.nextInt();
		
		if(((ano % 4 == 0) && (ano % 100 != 0)) || ((ano % 4 != 0) && (ano % 400 == 0))) {
			System.out.println("Ano Bissexto");
		} else {
			System.out.println("Não é ano Bissexto");
		}

		entrada.close();

	}

}
