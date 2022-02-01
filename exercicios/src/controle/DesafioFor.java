package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		
		for(valor.length(); valor.length() <= 5; valor += "#") {
			System.out.println(valor);
		}
		
		//versão do curso
		
//		for(String valor = "#"; !valor.equals("######"); valor += "#") {
//			System.out.println(valor);
//		}

	}

}
