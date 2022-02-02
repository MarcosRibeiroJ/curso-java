package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor, criei uma cópia de a, utilizando assim dois espaços diferentes de memória
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribuição por referência, nesse caso os dois objetos apontam para o mesmo espaço de memória
		
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
