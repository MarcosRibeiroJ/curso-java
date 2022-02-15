package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Ferrari f1 = new Ferrari();
		Civic c1 = new Civic();
		
		c1.acelerar();
		System.out.println("A velocidade do Civic é: " + c1.verVelocidadeAtual());
		
		c1.acelerar();
		System.out.println("A velocidade do Civic é: " + c1.verVelocidadeAtual());
		
		c1.acelerar();
		System.out.println("A velocidade do Civic é: " + c1.verVelocidadeAtual());
				
		f1.ligarTurbo();
//		f1.ligarAr();
		
		f1.acelerar();
		System.out.println("A velocidade da Ferrari é: " + f1.verVelocidadeAtual());
		
		f1.acelerar();
		System.out.println("A velocidade da Ferrari é: " + f1.verVelocidadeAtual());

		f1.acelerar();
		System.out.println("A velocidade da Ferrari é: " + f1.verVelocidadeAtual());
		
	}

}
