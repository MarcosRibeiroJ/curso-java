package controle;

/*
 * Nesse exemplo estou criando um rótulo para cada for com o objetivo de alterar o fluxo natural do continue
 * naturalmente o continue iria pular uma vez na estrutura de repetição mais interna, mas dando um rotulo eu consigo definir qual estrutura
 * deverá ser desconsiderada pulando a etapa de iteração
 * Não é recomendado utilizar essa técnica pois pode atrapalhar o fluxo do programa
 */

public class ContinueRotulado {

	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) { //criando um rótulo, ou apelido para o for externo
			for (int j = 0; j < 3; j++) { //criando um rótulo ou apelido para o for interno, mesmo processo do externo, mas não farei para não gerar advertência no eclipse por criar um rótulo e nao utilizar
				if(i == 1) {
					continue externo;
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");

	}

}
