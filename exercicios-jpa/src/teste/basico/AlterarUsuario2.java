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
		
		/* Mesmo com o merge comentado, ainda sim executando esse programa, as alterações foram feita no banco
		 * Isso aconteceu porque o objeto por padrão é gerenciado pelo JPA, isso significa que qualquer alteração
		 * Feita nele, dentro de um contexto de transação (transaction) irá resultar em uma alteração no banco
		 * Ou seja, em algum momento o JPA irá verificar que o objeto sofreu alteração e irá sincronizar isso com o BD
		 */
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
