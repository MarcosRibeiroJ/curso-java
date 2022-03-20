package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel {
	
	private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
	private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);
	
	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		//Linha 1
		adicionarBota("AC", COR_CINZA_ESCURO, c, 0, 0);
		adicionarBota("+/-", COR_CINZA_ESCURO, c, 1, 0);
		adicionarBota("%", COR_CINZA_ESCURO, c, 2, 0);
		adicionarBota("/", COR_LARANJA, c, 3, 0);

		//Linha 2
		adicionarBota("7", COR_CINZA_CLARO, c, 0, 1);
		adicionarBota("8", COR_CINZA_CLARO, c, 1, 1);
		adicionarBota("9", COR_CINZA_CLARO, c, 2, 1);
		adicionarBota("*", COR_LARANJA, c, 3, 1);
		
		//Linha 3
		adicionarBota("4", COR_CINZA_CLARO, c, 0, 2);
		adicionarBota("5", COR_CINZA_CLARO, c, 1, 2);
		adicionarBota("6", COR_CINZA_CLARO, c, 2, 2);
		adicionarBota("-", COR_LARANJA, c, 3, 2);
		
		//Linha 4
		adicionarBota("1", COR_CINZA_CLARO, c, 0, 3);
		adicionarBota("2", COR_CINZA_CLARO, c, 1, 3);
		adicionarBota("3", COR_CINZA_CLARO, c, 2, 3);
		adicionarBota("+", COR_LARANJA, c, 3, 3);
		
		//Linha 5
		adicionarBota("0", COR_CINZA_CLARO, c, 0, 4);
		adicionarBota("0", COR_CINZA_CLARO, c, 1, 4);
		adicionarBota(",", COR_CINZA_CLARO, c, 2, 4);
		adicionarBota("=", COR_LARANJA, c, 3, 4);
		
				
	}

	private void adicionarBota(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		add(botao, c);
	}

}
