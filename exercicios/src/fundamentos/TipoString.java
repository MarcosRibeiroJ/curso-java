package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		String s = "Boa Tarde";
		
		System.out.println("Primeiro caractere: " + s.charAt(0));
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println("Começa com Boa? " + s.startsWith("Boa"));
		System.out.println("Começa com boa? " + s.startsWith("boa"));
		System.out.println("Converti tudo para minuscula e agora começa com boa? " + s.toLowerCase().startsWith("boa"));
		System.out.println("Termina com Tarde? " + s.endsWith("Tarde"));
		System.out.println("É igual a boa tarde? " + s.equals("boa tarde"));
		System.out.println("Ignore maiuscula e minuscula, É igual a boa tarde? " + s.equalsIgnoreCase("boa tarde"));
		System.out.println("Tamanho da String: " + s.length());
		
		var nome = "Marcos";
		var sobrenome = "Ribeiro";
		var idade = 31;
		var salario = 12345.678;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f de salário.",
				nome, sobrenome, idade, salario);

	}

}
