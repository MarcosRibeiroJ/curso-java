package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data(24, 03, 1990); //construtor com parametros
		Data d2 = new Data(); //construtor padrão
		
		String dataFormatada1 = d1.obterDataFormatada(); // salvei em uma variavel para mostrar que é possível salvar o retorno do metodo em uma nova variavel 
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d2.imprimirDataFormatada();
	}

}
