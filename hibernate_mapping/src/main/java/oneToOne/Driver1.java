package oneToOne;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Scanner scanner = new Scanner(System.in);
		Pancard pancard = new Pancard();
		System.out.println("enter the pan address");
		pancard.setAddress(scanner.nextLine());
		System.out.println("enter the pan number");
		pancard.setPnumber(scanner.nextLine());
		Person person=new Person();
		System.out.println("enter the person name");
		person.setName(scanner.nextLine());
		person.setPancard(pancard);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pancard);
		entityTransaction.commit();
	}

}
