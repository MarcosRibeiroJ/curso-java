package controle;
/*
 * Nesse exemplo estou criando um rótulo para cada for com o objetivo de alterar o fluxo natural do break
 * naturalmente o break iria parar a estrutura de repetição mais interna, mas dando um rotulo eu consigo definir qual estrutura
 * deverá ser interrompida usando o break
 * Não é recomendado utilizar essa técnica pois pode atrapalhar o fluxo do programa
 */

public class BreakRotulado {

	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) { //criando um rótulo, ou apelido para o for externo
			for (int j = 0; j < 3; j++) { //criando um rótulo ou apelido para o for interno, mesmo processo do externo, mas não farei para não gerar advertência no eclipse por criar um rótulo e nao utilizar
				if(i == 1) {
					break externo;
				}
				
				System.out.printf("%d %d ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}

}
