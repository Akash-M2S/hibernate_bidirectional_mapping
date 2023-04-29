package oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver2 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		InstaAccount account = new InstaAccount();
		account.setInstaName("lokesh_belli");
		
		InstaAccount account2 = new InstaAccount();
		account2.setInstaName("its_me_lokesh");
		
		InstaAccount account3 = new InstaAccount();
		account3.setInstaName("lokeh_loki");
		
		List<InstaAccount> list = new ArrayList<InstaAccount>();
		list.add(account);
		list.add(account2);
		list.add(account3);
		
		Student student = new Student();
		student.setId(2);
		student.setSname("lokesh");
		student.setInsta(list);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(account);
		entityManager.persist(account2);
		entityManager.persist(account3);
		entityTransaction.commit();

	}
}