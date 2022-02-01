package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		//Se os dois trabalhos forem V, comprar tv de 50 polegadas
		//Se apenas um dos dois trabalhos derem certo, TV de 32 polegadas
		//Se algum dos dois trabalhos derem certo, comprar sorvete
		//Se nenhum der certo, ficar em casa sem TV nem sorvete
		
		//Inicio da minha resolução
		
//		boolean trabalhoTerca = false;
//		boolean trabalhoQuinta = true;
//		String msgTV, msgSorvete;
//		
//		msgTV = (trabalhoTerca && trabalhoQuinta)? "Comprar TV de 50\"" : (trabalhoTerca ^ trabalhoQuinta)? "Comprar TV de 32\"" : "Não comprar TV";
//		msgSorvete = (msgTV.equals("Comprar TV de 50\"") || msgTV.equals("Comprar TV de 32\""))? "Comprar sorvete" : "Não comprar sorvete";
//		System.out.println(msgTV + " " + msgSorvete);
		
		// Fim da minha resolução
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		
		System.out.println("Comprou TV de 50\"? " + comprouTV50);
		System.out.println("Comprou TV de 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + !comprouSorvete);
		
	}

}
