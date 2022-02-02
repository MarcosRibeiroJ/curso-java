package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));//para imprimir um array num formato legível
		System.out.println(notasAlunoA[0]); //primeira nota do aluno A
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); //ultima nota do aluno A
		
		double totalAlunoA = 0;
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 }; //array com dados literais, já inicializando com os valores
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];			
		}

		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
