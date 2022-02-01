package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String frase = "";
		
		while(!frase.equalsIgnoreCase("sair")) {
			
			System.out.print("Digite uma frase ou sair para encerrar: ");
			frase = entrada.nextLine();
			
			System.out.println("\nFrase digitada: " + frase);
		}
		entrada.close();
		System.out.println("Programa Encerrado");

	}

}
