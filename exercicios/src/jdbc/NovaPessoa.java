package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
		/*
		 * O PreparedStatement impede a utilização de SQL Injection no código
		 * Para utilizá-lo no código SQL eu não insiro diretamente o valor e nem a varável que está armazenando esse valor
		 * No lugar de cada variável eu digito ?
		 * E quando chamar o método setTIPOVARIÁVEL cada ? será um numero começando em 1
		 * Exemplo: VALUES(? , ? , ?) no lugar de codigo INT, nome String e valor Double
		 * setInt(1, codigo)
		 * setString(2, nome)
		 * setDouble(3, valor)
		 */
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		
		entrada.close();
		conexao.close();
		
	}
}
