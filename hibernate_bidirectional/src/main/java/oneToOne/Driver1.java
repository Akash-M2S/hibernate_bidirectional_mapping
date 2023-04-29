package oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pancard pancard=new Pancard();
		pancard.setPnumber("dtdpas9025");
		
		Person person=new Person();
		person.setPancard(pancard);
		person.setName("akash");
		pancard.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pancard);
		entityTransaction.commit();
		
	}
	}
