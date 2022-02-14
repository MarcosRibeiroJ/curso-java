package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador monstro = new Monstro(10, 10);
				
		Heroi heroi = new Heroi(10, 11);
				
		System.out.println("Monstro tem => " + monstro.totalVida());
		System.out.println("Heroi tem => " + heroi.totalVida());
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.totalVida());
		System.out.println("Heroi tem => " + heroi.totalVida());
	}

}
