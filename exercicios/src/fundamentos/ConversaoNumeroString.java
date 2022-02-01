package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		//convertendo um objeto da classe integer
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		//convertendo um valor de tipo primitivo
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		
		//posso também converter concatenando um número em uma stringo vazia, mas nao é recomendado
		System.out.println("" + num1);

	}

}
