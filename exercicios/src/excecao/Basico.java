package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		//Tratando o erro de forma genérica eu capturo a exceção utilizando o tipo Exception (que é a classe mais genérica de exceções)
		//Isso nao é recomendado, sendo mais correto capturar exatamente o tipo de erro que pode acontecer em cada situação
		try {
			imprimirNomeAluno(a1);			
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do aluno");
		}
		
		
		//Nesse caso capturei o erro do tipo ArithmeticException, sendo nesse caso mais específico e utilizando exatamente a classe do erro
		//que pode acontecer ao executar o código
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage()); //nesse caso os erros do tipo ArithmeticException possuem uma mensagem de erro, sendo possível imprimir essa mensagem utilizando o getMessage()
		}
		
		System.out.println("Fim :)");

	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}
