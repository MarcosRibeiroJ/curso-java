package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		//convertendo um objeto da classe integer
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		//convertendo um valor de tipo primitivo
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		
		//posso tamb�m converter concatenando um n�mero em uma stringo vazia, mas nao � recomendado
		System.out.println("" + num1);

	}

}
