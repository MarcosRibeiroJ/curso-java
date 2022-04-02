package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o código da pessoa: ");
		int codigo = entrada.nextInt();
		
		entrada.nextLine();

		String sqlSelect = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();
		
		if(r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual é: " + p.getNome());
			
			System.out.print("Digite o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			
			stmt = conexao.prepareStatement(sqlUpdate);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();

			System.out.println("\nRegistro alterado com sucesso!\n");
		} else {
			System.out.println("Código não localizado");
		}

		conexao.close();
		entrada.close();	
	}

}
