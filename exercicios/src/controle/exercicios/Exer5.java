package controle.exercicios;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int num = entrada.nextInt();
		int contadorDivisores = 0;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				contadorDivisores++;
			}
		}
		
		switch(contadorDivisores) {
		case 0:
			System.out.println("O n�mero digitado � um n�mero primo");
			break;
		default:
			System.out.println("O n�mero digitado N�O � um n�mero primo");
		}
		
		entrada.close();

	}

}
