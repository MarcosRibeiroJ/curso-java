package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 4.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
		String resultadoFinal = media >= 7 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);

	}

}
