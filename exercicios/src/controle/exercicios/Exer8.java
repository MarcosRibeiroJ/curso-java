package controle.exercicios;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um texto: ");
		String texto = entrada.nextLine();
		
		for(int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}

		entrada.close();

	}

}
