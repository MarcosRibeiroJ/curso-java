package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		//Usuário digita + - * / ou %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double num1 = entrada.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = entrada.nextDouble();
		System.out.println("Digite o sinal da operação desejada + - * / ou %:");
		String sinal = entrada.next();
		
		double resultado = (sinal.equals("+"))? num1 + num2 :
			(sinal.equals("-"))? num1 - num2 :
				(sinal.equals("*"))? num1 * num2 :
					(sinal.equals("/"))? num1 / num2 :
						(sinal.equals("%"))? num1 % num2 : 0;
		
		System.out.println("O resultado é " + resultado);
		
		entrada.close();

	}

}
