package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		//conversão implicita de inteiro para double
		double a = 1;
		System.out.println(a);
		
		//conversão explicita de double para float
		//mesmo declarando como float, o padrão do java é definir como double, então preciso explicitamente definir como float
		//posso fazer isso acrescentando a letra F ao final do número ou usando cast como no exemplo abaixo
		//também é importante notar que devido ao tamanho possivel de armazenamento do float, o valor será "cortado" para armazer na variavel
		float b = (float) 1.1234567891011;
		System.out.println(b);
		
		//conversão explicita de int para byte usando cast
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);

		//conversão explicita de double para int usando cast
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
	}

}
