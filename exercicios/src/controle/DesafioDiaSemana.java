package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do dia da Semana. Exmp: Domingo: ");
		String diaDaSemana = entrada.next();
		
		entrada.close();
		
		if(diaDaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		} else if(diaDaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		} else if(diaDaSemana.equalsIgnoreCase("Ter�a")
				|| diaDaSemana.equalsIgnoreCase("Terca")) {
			System.out.println(3);
		} else if(diaDaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		} else if(diaDaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		} else if(diaDaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		} else if(diaDaSemana.equalsIgnoreCase("S�bado")
				|| diaDaSemana.equalsIgnoreCase("Sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Valor inv�lido");
		}

	}

}
