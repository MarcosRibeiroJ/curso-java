package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		/*
		 * Finally sempre é chamado, gerando um erro ou não
		 * Pode ser uma boa opção colocar no bloco finally para fechar a conexão com um banco de dados
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
