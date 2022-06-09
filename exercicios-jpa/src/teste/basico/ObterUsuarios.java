package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u"; //criando a consulta na classe Usuario usando JPQL
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class); //setando a consulta criada em um objeto do tipo query
		query.setMaxResults(5); //definindo que o retorno da consulta terá apenas 5 resultados
		
		List<Usuario> usuarios = query.getResultList();//armazenando o resultado em uma lista
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId() + " Email: " + usuario.getEmail());//imprimindo os resultados
		}
		
		
		em.close();
		emf.close();
	}

}
