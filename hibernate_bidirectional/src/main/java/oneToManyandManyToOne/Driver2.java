package oneToManyandManyToOne;

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
		
		Student student = new Student();
		student.setSname("akash");

		TwitterAccount account = new TwitterAccount();
		account.setTwitterName("kannadiga_akash");
		account.setStudent(student);

		TwitterAccount account2 = new TwitterAccount();
		account2.setTwitterName("tweet@akash");
		account2.setStudent(student);

		TwitterAccount account3 = new TwitterAccount();
		account3.setStudent(student);
		account3.setTwitterName("@rcbfan");
		
		List<TwitterAccount>list=new ArrayList<TwitterAccount>();
		list.add(account);
		list.add(account2);
		list.add(account3);
		student.setTwitter(list);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(account);
		entityManager.persist(account2);
		entityManager.persist(account3);
		entityTransaction.commit();
		
	}
}
