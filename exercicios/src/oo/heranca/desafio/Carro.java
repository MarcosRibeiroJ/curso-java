package oo.heranca.desafio;

public class Carro {
	
	private final int VELOCIDADE_MAXIMA;
	private int velocidadeAtual;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
		} else {			
			this.velocidadeAtual += delta;
		}
	}
	
	public void frear() {
		if(this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;			
		} else {
			this.velocidadeAtual = 0;
		}
	}
	
	public int verVelocidadeAtual() {
		return velocidadeAtual;
	}

}
