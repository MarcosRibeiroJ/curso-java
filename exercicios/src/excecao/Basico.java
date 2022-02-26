package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		//Tratando o erro de forma gen�rica eu capturo a exce��o utilizando o tipo Exception (que � a classe mais gen�rica de exce��es)
		//Isso nao � recomendado, sendo mais correto capturar exatamente o tipo de erro que pode acontecer em cada situa��o
		try {
			imprimirNomeAluno(a1);			
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do aluno");
		}
		
		
		//Nesse caso capturei o erro do tipo ArithmeticException, sendo nesse caso mais espec�fico e utilizando exatamente a classe do erro
		//que pode acontecer ao executar o c�digo
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage()); //nesse caso os erros do tipo ArithmeticException possuem uma mensagem de erro, sendo poss�vel imprimir essa mensagem utilizando o getMessage()
		}
		
		System.out.println("Fim :)");

	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
