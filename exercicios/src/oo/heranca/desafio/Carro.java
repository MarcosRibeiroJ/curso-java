package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	int delta = 5;
	
	Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			this.velocidadeAtual = this.VELOCIDADE_MAXIMA;
		} else {			
			this.velocidadeAtual += delta;
		}
	}
	
	void frear() {
		if(this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;			
		} else {
			this.velocidadeAtual = 0;
		}
	}

}
