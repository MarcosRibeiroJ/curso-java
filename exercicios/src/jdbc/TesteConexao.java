package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

		final String url ="jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "**"; //usuario que conecto no banco
		final String senha = "**"; //senha que uso para conectar no banco
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexao efetuada com sucesso!");
		conexao.close();
	}

}
