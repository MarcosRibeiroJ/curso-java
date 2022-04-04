package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o c�digo para excluir o registro: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();

		if(contador > 0) {
			System.out.println("Pessoa exclu�da com sucesso!");
		} else {
			System.out.println("Nenhum registro exclu�do");
		}
		
		System.out.println("Linhas afetadas: " + contador);
		
		conexao.close();
		entrada.close();
	}

}
