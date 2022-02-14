package oo.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	
	void testeAcessos() {
		//System.out.println(esposa.segredo); não consigo acessar o atributo porque está privado
		System.out.println(esposa.facoDentroDeCasa); //consigo acessar porque está no mesmo pacote
		System.out.println(esposa.formaDeFalar); //nesse caso quem herdar de ana e quem está no mesmo pacote acessam
		System.out.println(esposa.todosSabem); //publico todos acessam
	}

}
