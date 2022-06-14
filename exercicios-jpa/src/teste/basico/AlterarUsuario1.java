package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Leonardo");
		usuario.setEmail("leonardo@testeJPA.com");
		
		em.merge(usuario);//para persistir dados de um elemento que já existe no BD, nao posso usar o persiste, tenho que usar merge
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
