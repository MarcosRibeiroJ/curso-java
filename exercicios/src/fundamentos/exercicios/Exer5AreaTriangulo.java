package fundamentos.exercicios;

import java.util.Scanner;

public class Exer5AreaTriangulo {

	public static void main(String[] args) {
		double base, altura, area;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base em centimetros:");
		base = entrada.nextDouble();
		System.out.println("Digite a altura em centimetros:");
		altura = entrada.nextDouble();
		
		entrada.close();
		
		area = (base * altura) /2;
		
		System.out.println("A área do triangulo é: " + area);

	}

}
