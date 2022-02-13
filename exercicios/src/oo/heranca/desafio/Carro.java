package oo.heranca.desafio;

public class Carro {
	
	int velocidadeAtual;
	
	void acelerar() {
		this.velocidadeAtual += 5;
	}
	
	void frear() {
		if(this.velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;			
		} else {
			this.velocidadeAtual = 0;
		}
	}

}
