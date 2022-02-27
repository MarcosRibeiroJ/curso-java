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
	
	//Exce��es do tipo RunTimeException s�o por defini��o n�o verificadas ou n�o tratadas
	//Isso quer dizer que o compilador me da ap��o de tratar esse erro ou nao, caso eu n�o queria
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}

	
	//Exce��es do tipo Exception s�o tratadas, isso quer dizer que no m�todo que lan�a a Exce��o, devo definir como throws e o nome da exe��o
	//Quem chamar esse m�todo dever� implementar o try catch
	//Outra alternativa seria internamente no m�todo que lan�a a exce��o, j� implementar o try catch
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");		
	}
}
