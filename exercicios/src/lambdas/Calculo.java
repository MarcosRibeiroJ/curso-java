package lambdas;

/*
 * Por padr�o m�todos de interface s�o publicos e abstratos
 * Acrescentei a nota��o @FunctionalInterface somente para deixar explicito que essa � uma interface funcional
 * Interfaces funcionais possuem apenas um m�todo abstrato
 * Caso eu acrescente mais um m�todo e tire a nota��o @FunctionalInterface n�o poderei mais atribuir fun��es lambda a essa interface
 * A n�o ser nos casos em que tenha um m�todo default ou static
 */

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}
