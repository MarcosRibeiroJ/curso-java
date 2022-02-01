package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		double nota = 0;
		double totalNota = 0;
		
		while(nota != -1) {
			System.out.print("Digite uma nota ou -1 para sair: ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				totalNota += nota;
				cont++;
			} else if(nota == -1) {
				System.out.println("Cadastro de notas finalizado");
			} else {
				System.out.println("Nota inv�lida");
			}
		}
		
		entrada.close();

		double media = totalNota / cont;
		
		System.out.printf("A m�dia �: %.2f", media);


	}

}
