package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data(24, 01, 1990);
		Data d2 = new Data();
		
		String dataFormatada1 = d1.obterDataFormatada(); // salvei em uma variavel para mostrar que é possível salvar o retorno do metodo em uma nova variavel 
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d2.imprimirDataFormatada();
	}

}
