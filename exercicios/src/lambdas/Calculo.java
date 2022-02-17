package lambdas;

/*
 * Por padrão métodos de interface são publicos e abstratos
 * Acrescentei a notação @FunctionalInterface somente para deixar explicito que essa é uma interface funcional
 * Interfaces funcionais possuem apenas um método
 * Caso eu acrescente mais um método e tire a notação @FunctionalInterface não poderei mais atribuir funções lambda a essa interface
 */

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
}
