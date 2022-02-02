package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		//Objetos com null ou sem atribuição de valor geram um erro de NullPointerException pq a variavel nao foi inicializada
		//ou seja, não aponta para nenhum local
		//para corrigit nesse código irei fazer uma condicional para testar se a variavel é nula ou nao
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));

		String s2 = Math.random() > 0.5 ? "Funcionou" : null;
		if(s2 != null) {
			System.out.println(s2.concat("!!!")); 			
		}
		
	}

}
