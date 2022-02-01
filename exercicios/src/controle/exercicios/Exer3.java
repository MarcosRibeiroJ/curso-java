package controle.exercicios;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a primeira nota do aluno: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota do aluno: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado");
		} else if(media > 4 && media < 7) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}

		entrada.close();

	}

}
