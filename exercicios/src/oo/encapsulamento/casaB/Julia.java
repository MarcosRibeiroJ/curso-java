package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		//System.out.println(sogra.segredo); //n�o consigo acessar o atributo porque est� privado
		//System.out.println(sogra.facoDentroDeCasa); //n�o consigo acessar porque est� num pacote diferente
		//System.out.println(sogra.formaDeFalar); //n�o consigo acessar porque Julia nao herda de Ana
		System.out.println(sogra.todosSabem); //consigo acessar porque est� publico
	}

}
