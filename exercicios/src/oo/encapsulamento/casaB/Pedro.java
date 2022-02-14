package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		//System.out.println(mae.segredo); //não consigo acessar o atributo porque está privado
		//System.out.println(mae.facoDentroDeCasa); //não consigo acessar porque está num pacote diferente
		System.out.println(formaDeFalar); //consigo acessar diretamente usando o atributo herdado, caso tenten instanciar Ana retornará erro
		System.out.println(todosSabem); //consigo acessar diretamente usando o atributo herdado e instanciando um novo objeto do tipo ana
	}
}
