package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Ferrari f1 = new Ferrari();
		Civic c1 = new Civic();
		
		System.out.println("A velocidade da Ferrari é: " + f1.velocidadeAtual);
		System.out.println("A velocidade do Civic é: " + c1.velocidadeAtual);
		System.out.println();
		
		f1.acelerar();
		
		c1.acelerar();

		System.out.println("A velocidade da Ferrari é: " + f1.velocidadeAtual);
		System.out.println("A velocidade do Civic é: " + c1.velocidadeAtual);
		System.out.println();
		
		f1.frear();
		c1.frear();
		c1.frear();

		System.out.println("A velocidade da Ferrari é: " + f1.velocidadeAtual);
		System.out.println("A velocidade do Civic é: " + c1.velocidadeAtual);
	}

}
