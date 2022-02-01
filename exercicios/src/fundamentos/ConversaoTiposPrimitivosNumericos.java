package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		//convers�o implicita de inteiro para double
		double a = 1;
		System.out.println(a);
		
		//convers�o explicita de double para float
		//mesmo declarando como float, o padr�o do java � definir como double, ent�o preciso explicitamente definir como float
		//posso fazer isso acrescentando a letra F ao final do n�mero ou usando cast como no exemplo abaixo
		//tamb�m � importante notar que devido ao tamanho possivel de armazenamento do float, o valor ser� "cortado" para armazer na variavel
		float b = (float) 1.1234567891011;
		System.out.println(b);
		
		//convers�o explicita de int para byte usando cast
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);

		//convers�o explicita de double para int usando cast
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}

}
