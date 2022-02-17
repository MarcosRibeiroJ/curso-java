package oo.polimorfismo;

/**
 * Essa classe foi definida como abstrata (abstract)
 * Isso quer dizer que o usuário não pode instanciar diretamente essa classe
 * Tendo que instanciar alguma outra que herde dessa
 */

public abstract class Comida {
	
	private double peso;
	
	public Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {			
			this.peso = peso;
		}
	}

}
