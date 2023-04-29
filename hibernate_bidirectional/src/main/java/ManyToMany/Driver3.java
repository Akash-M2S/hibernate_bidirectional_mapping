package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver3 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = new Hospital();
		hospital.setHname("apollo hospital");

		Hospital hospital2 = new Hospital();
		hospital2.setHname("kangaroo hospital");

		Hospital hospital3 = new Hospital();
		hospital3.setHname("gayatri hospital");

		List<Hospital> list= new ArrayList<Hospital>();
		list.add(hospital);
		list.add(hospital2);
		list.add(hospital3);
		
		Doctor doctor=new Doctor();
		doctor.setDname("dr.akash");
		doctor.setHospital(list);
		
		Doctor doctor2=new Doctor();
		doctor2.setDname("dr.nithin k s");
		doctor2.setHospital(list);
		
		Doctor doctor3=new Doctor();
		doctor3.setDname("dr.keerthi");
		doctor3.setHospital(list);
		
		List<Doctor>liDoctors=new ArrayList<Doctor>();
		liDoctors.add(doctor);
		liDoctors.add(doctor2);
		liDoctors.add(doctor3);
		
		hospital.setDoctor(liDoctors);
		hospital2.setDoctor(liDoctors);
		hospital3.setDoctor(liDoctors);
		
		entityTransaction.begin();
		entityManager.persist(doctor);
		entityManager.persist(doctor2);
		entityManager.persist(doctor3);
		
		entityManager.persist(hospital);
		entityManager.persist(hospital2);
		entityManager.persist(hospital3);
		entityTransaction.commit();
		

	}
}
