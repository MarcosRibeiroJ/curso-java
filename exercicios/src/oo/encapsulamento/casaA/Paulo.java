package oo.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcessos() {
		//System.out.println(esposa.segredo); n�o consigo acessar o atributo porque est� privado
		System.out.println(esposa.facoDentroDeCasa); //consigo acessar porque est� no mesmo pacote
		System.out.println(esposa.formaDeFalar); //nesse caso quem herdar de ana e quem est� no mesmo pacote acessam
		System.out.println(esposa.todosSabem); //publico todos acessam
	}

}
