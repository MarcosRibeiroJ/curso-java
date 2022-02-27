package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		/*
		 * Finally sempre � chamado, gerando um erro ou n�o
		 * Pode ser uma boa op��o colocar no bloco finally para fechar a conex�o com um banco de dados
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalmente encerrou");
			entrada.close();
		}
		
		System.out.println("Fim");

	}

}
