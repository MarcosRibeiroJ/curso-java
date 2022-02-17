package lambdas;

/*
 * Por padrão métodos de interface são publicos e abstratos
 * Acrescentei a notação @FunctionalInterface somente para deixar explicito que essa é uma interface funcional
 * Interfaces funcionais possuem apenas um método abstrato
 * Caso eu acrescente mais um método e tire a notação @FunctionalInterface não poderei mais atribuir funções lambda a essa interface
 * A não ser nos casos em que tenha um método default ou static
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
