package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		this(1, 1, 1970); //caso nao insira parametros, o construtor padr�o ir� chamar o segundo construtor inserindo a data padr�o
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//01/01/1970 padrao
	
	String obterDataFormatada() {
		//return dia + "/" + mes + "/" + ano; essa era a minha vers�o, vou usar a vers�o da aula pq cont�m um m�todo que eu n�o conhecia
		final String formato = "%d/%d/%d"; 
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
}
