package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	//01/01/1970 padrao
	
	String obterDataFormatada() {
		//return dia + "/" + mes + "/" + ano; essa era a minha vers�o, vou usar a vers�o da aula pq cont�m um m�todo que eu n�o conhecia
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
