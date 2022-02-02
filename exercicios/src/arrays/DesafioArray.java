package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite a quantidade de notas que serão armazenadas: ");
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double[qtdeNotas];
		double totalNotas = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d: ", i + 1);
			notas[i] = entrada.nextDouble();
		}
		
		entrada.close();
		
		for(double nota: notas) {
			totalNotas += nota;
		}
		
		double media = totalNotas / qtdeNotas;
		System.out.printf("A média do aluno é: %.2f", media);
	}

}
