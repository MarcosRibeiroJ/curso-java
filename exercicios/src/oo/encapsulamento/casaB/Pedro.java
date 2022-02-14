package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		//System.out.println(mae.segredo); //n�o consigo acessar o atributo porque est� privado
		//System.out.println(mae.facoDentroDeCasa); //n�o consigo acessar porque est� num pacote diferente
		System.out.println(formaDeFalar); //consigo acessar diretamente usando o atributo herdado, caso tenten instanciar Ana retornar� erro
		System.out.println(todosSabem); //consigo acessar diretamente usando o atributo herdado e instanciando um novo objeto do tipo ana
	}
}
