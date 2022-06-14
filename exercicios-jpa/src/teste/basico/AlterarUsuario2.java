package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Leonardo Leitao");
		
//		em.merge(usuario);
		
		/* Mesmo com o merge comentado, ainda sim executando esse programa, as altera��es foram feita no banco
		 * Isso aconteceu porque o objeto por padr�o � gerenciado pelo JPA, isso significa que qualquer altera��o
		 * Feita nele, dentro de um contexto de transa��o (transaction) ir� resultar em uma altera��o no banco
		 * Ou seja, em algum momento o JPA ir� verificar que o objeto sofreu altera��o e ir� sincronizar isso com o BD
		 */
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
