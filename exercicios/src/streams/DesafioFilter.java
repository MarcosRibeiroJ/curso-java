package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		FuncionarioDesafioFilter f1 = new FuncionarioDesafioFilter("Ana", "156", "Telefonico");
		FuncionarioDesafioFilter f2 = new FuncionarioDesafioFilter("Maria", "Semurb", "Presencial");
		FuncionarioDesafioFilter f3 = new FuncionarioDesafioFilter("Antonio", "SAC", "Telefonico");
		FuncionarioDesafioFilter f4 = new FuncionarioDesafioFilter("Luiz", "156", "Telefonico");
		FuncionarioDesafioFilter f5 = new FuncionarioDesafioFilter("João", "Defesa Civil", "Telefonico");
		FuncionarioDesafioFilter f6 = new FuncionarioDesafioFilter("Carla", "156", "Presencial");
		
		List<FuncionarioDesafioFilter> funcionarios = Arrays.asList(f1, f2, f3, f4, f5, f6);
		
		Predicate<FuncionarioDesafioFilter> operacao = f -> f.operacao.equals("156");
		Predicate<FuncionarioDesafioFilter> contrato = f -> f.contrato.equals("Telefonico");
		
		Function<FuncionarioDesafioFilter, String> funcionarioLocalizado = f -> "Nome: " + f.nome + " Operação: " + f.operacao + " Contrato: " + f.contrato;
		
		funcionarios.stream()
			.filter(operacao)
			.filter(contrato)
			.map(funcionarioLocalizado)
			.forEach(System.out::println);

	}

}
