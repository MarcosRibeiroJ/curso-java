package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o código da pessoa: ");
		int codigo = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Digite o novo nome: ");
		String novoNome = entrada.nextLine();
		
		entrada.close();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		String sqlSelect = "SELECT * FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmtS = conexao.prepareStatement(sqlSelect);
		stmtS.setInt(1, codigo);
		
		ResultSet resultado = stmtS.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(resultado.next()) {
			codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		PreparedStatement stmtU = conexao.prepareStatement(sqlUpdate);
		stmtU.setString(1, novoNome);
		stmtU.setInt(2, codigo);
		
		stmtU.execute();
		
		resultado = stmtS.executeQuery();
		
		while(resultado.next()) {
			codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		System.out.println("\nRegistro alterado com sucesso!\n");
		
		for(Pessoa p : pessoas) {
			System.out.println("| " + p.getCodigo() + " | " + p.getNome());
		}
		
		conexao.close();
	}

}
