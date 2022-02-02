package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribui��o por valor, criei uma c�pia de a, utilizando assim dois espa�os diferentes de mem�ria
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribui��o por refer�ncia, nesse caso os dois objetos apontam para o mesmo espa�o de mem�ria
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarValorPrimitivo(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarValorPrimitivo(int a) {
		a++;
	}

}
