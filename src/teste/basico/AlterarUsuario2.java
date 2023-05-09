package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		//estado gerenciado
		Usuario usuario = em.find(Usuario.class, 5L);
		usuario.setNome("Zoro");
		
		
//		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
