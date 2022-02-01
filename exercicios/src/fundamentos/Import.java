package fundamentos;

import java.util.Date;

//import javax.swing.JButton;

public class Import {

	public static void main(String[] args) {
		// Classe string e metodo println estão dentro do pacote java.lang, nesse caso nao é necasspario importar
		java.lang.String b = "Bom Dia!";
		java.lang.System.out.println(b);
		
		// Tipo Date esta dentro do pacote java.util e preciso importar
		Date data = new Date();
		System.out.println(data);
		
		//JButton está dentro do pacote java.swing.JButton e preciso importar
		//JButton botao = new JButton();
		
		

	}

}
