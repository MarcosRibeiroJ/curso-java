package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //definindo um numero que passa da capacidade do inteiro, para declarar como long, deve acrescentar a letra L ao final do numero
		
		//Tipos numericos reais (ponto flutuante)
		float salario = 11_445.44F; //por padrão ponto flutuante é double, como estou declarando como float, preciso acrescentar o F ao final
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A'; //ativo na empresa
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
