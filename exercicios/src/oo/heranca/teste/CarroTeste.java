package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Ferrari f1 = new Ferrari();
		Civic c1 = new Civic();
		
		System.out.println("A velocidade da Ferrari �: " + f1.verVelocidadeAtual());
		System.out.println("A velocidade do Civic �: " + c1.verVelocidadeAtual());
		System.out.println();
		
		f1.acelerar();
		
		c1.acelerar();

		System.out.println("A velocidade da Ferrari �: " + f1.verVelocidadeAtual());
		System.out.println("A velocidade do Civic �: " + c1.verVelocidadeAtual());
		System.out.println();
		
		f1.frear();
		c1.frear();
		c1.frear();

		System.out.println("A velocidade da Ferrari �: " + f1.verVelocidadeAtual());
		System.out.println("A velocidade do Civic �: " + c1.verVelocidadeAtual());
	}

}
