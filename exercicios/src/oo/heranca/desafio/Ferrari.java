package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	boolean ligarTurbo;
	boolean ligarAr;
	
	public Ferrari() {
		this(340);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;		
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
	//Comentei a sobrescrita do método acelerar porque agora eu tenho como alterar o atributo delta da super classe Carro
	//esse atributo é a quantidade de aceleração que é acrescentada ao chamar o metodo acelerar
	
//	@Override
//	void acelerar() {
//		super.velocidadeAtual += 15;
//	}

}
