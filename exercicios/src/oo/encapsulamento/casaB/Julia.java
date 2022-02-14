package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		//System.out.println(sogra.segredo); //não consigo acessar o atributo porque está privado
		//System.out.println(sogra.facoDentroDeCasa); //não consigo acessar porque está num pacote diferente
		//System.out.println(sogra.formaDeFalar); //não consigo acessar porque Julia nao herda de Ana
		System.out.println(sogra.todosSabem); //consigo acessar porque está publico
	}

}
