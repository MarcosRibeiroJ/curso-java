package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());;
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	//Exceções do tipo RunTimeException são por definição não verificadas ou não tratadas
	//Isso quer dizer que o compilador me da apção de tratar esse erro ou nao, caso eu não queria
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	
	//Exceções do tipo Exception são tratadas, isso quer dizer que no método que lança a Exceção, devo definir como throws e o nome da exeção
	//Quem chamar esse método deverá implementar o try catch
	//Outra alternativa seria internamente no método que lança a exceção, já implementar o try catch
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");		
	}
}
