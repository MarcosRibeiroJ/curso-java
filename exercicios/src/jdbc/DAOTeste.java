package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Sara Ribeiro"));
		System.out.println(dao.incluir(sql, "Rebecca Galdencio"));
		System.out.println(dao.incluir(sql, "Gustavo Neres"));
		
		dao.close();
	}

}
