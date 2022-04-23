package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		/* EntityManagerFactory
		 * responsavel por gerenciar as EntityManager
		 * Devo instanciar uma classe Persistence e passo como parametro para o método createEntityManagerFactory
		 * a unidade de persistencia definida no arquivo persistence.xml
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		
		/* EntityManager
		 * responsável pelo CRUD de uma entidade (classe) mapeada para ser utilizada em banco de dados
		 * Também possue internamente informações para conexão ao banco
		 */
		EntityManager em = emf.createEntityManager();
		
		/* Inserir informações no banco
		 * Para inserir dados no banco, devo utilizar o método persist
		 * Passando como parametro um objeto de classe mapeada
		 */
		
		Usuario novoUsuario = new Usuario("Leo", "leo@testeJPA.com");
		
		em.getTransaction().begin(); //inicia uma transação com BD
		em.persist(novoUsuario); //insere os dados de novo usuario no banco (INSERT do SQL)
		em.getTransaction().commit(); //commit das alterações
		
		System.out.println("O ID gerado para o novo usuario é: " + novoUsuario.getId());
		
		em.close();
		emf.close();

	}

}
