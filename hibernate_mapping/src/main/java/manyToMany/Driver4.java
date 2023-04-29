package manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver4 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		TouristPlace place = new TouristPlace();
		place.setPlace("tumkur");
		TouristPlace place1 = new TouristPlace();
		place1.setPlace("Turuvekere");
		TouristPlace place2 = new TouristPlace();
		place2.setPlace("mangalore");
		TouristPlace place3 = new TouristPlace();
		 place3.setPlace("udupi");
		 
		 List<TouristPlace>list=new ArrayList<TouristPlace>();
		 list.add(place);
		 list.add(place1);
		 list.add(place2);
		 list.add(place3);
		 
		 Traveller traveller=new Traveller();
		 traveller.setTname("akash");
		 traveller.setList(list);
		 
		 Traveller traveller1=new Traveller();
		 traveller1.setTname("navya");
		 traveller1.setList(list);
		 
		 Traveller traveller2=new Traveller();
		 traveller2.setTname("alex");
		 traveller2.setList(list);

		 Traveller traveller3=new Traveller();
		 traveller3.setTname("nithin");
		 traveller3.setList(list);
		 
		 entityTransaction.begin();
		 entityManager.persist(place);
		 entityManager.persist(place1);
		 entityManager.persist(place2);
		 entityManager.persist(place3);
		 entityManager.persist(traveller);
		 entityManager.persist(traveller1);
		 entityManager.persist(traveller2);
		 entityManager.persist(traveller3);
		 entityTransaction.commit();

	}

}
