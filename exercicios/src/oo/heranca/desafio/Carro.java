package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	private int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
		} else {			
			this.velocidadeAtual += getDelta();
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

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
