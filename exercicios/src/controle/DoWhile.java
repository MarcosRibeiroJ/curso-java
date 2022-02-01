package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";

		do {
			
			System.out.println("Digite sair para encerrar: ");
			texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("sair"));

		entrada.close();

	}

}
