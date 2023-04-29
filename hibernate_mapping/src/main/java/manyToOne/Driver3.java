package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver3 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Train train=new Train();
		train.setTname("bangalore express");
		
		Passenger passenger=new Passenger();
		passenger.setName("manoj");
		passenger.setTrain(train);
		
		Passenger passenger1=new Passenger();
		passenger1.setName("srujan");
		passenger1.setTrain(train);
		
		Passenger passenger2=new Passenger();
		passenger2.setName("lingaraju");
		passenger2.setTrain(train);
		
		Passenger passenger3=new Passenger();
		passenger3.setName("nithin");
		passenger3.setTrain(train);
		try{
		entityTransaction.begin();
		entityManager.persist(train);
		entityManager.persist(passenger);
		entityManager.persist(passenger1);
		entityManager.persist(passenger2);
		entityManager.persist(passenger3);
		entityTransaction.commit();
		}
		catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
	}
}
