package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari() {
		this(340);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		super.delta = 15;
	}
	
	//Comentei a sobrescrita do m�todo acelerar porque agora eu tenho como alterar o atributo delta da super classe Carro
	//esse atributo � a quantidade de acelera��o que � acrescentada ao chamar o metodo acelerar
	
//	@Override
//	void acelerar() {
//		super.velocidadeAtual += 15;
//	}

}
