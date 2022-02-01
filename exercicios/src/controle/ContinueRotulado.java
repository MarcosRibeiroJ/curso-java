package controle;

/*
 * Nesse exemplo estou criando um r�tulo para cada for com o objetivo de alterar o fluxo natural do continue
 * naturalmente o continue iria pular uma vez na estrutura de repeti��o mais interna, mas dando um rotulo eu consigo definir qual estrutura
 * dever� ser desconsiderada pulando a etapa de itera��o
 * N�o � recomendado utilizar essa t�cnica pois pode atrapalhar o fluxo do programa
 */

public class ContinueRotulado {

	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) { //criando um r�tulo, ou apelido para o for externo
			for (int j = 0; j < 3; j++) { //criando um r�tulo ou apelido para o for interno, mesmo processo do externo, mas n�o farei para n�o gerar advert�ncia no eclipse por criar um r�tulo e nao utilizar
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
