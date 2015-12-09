package zoojpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import zoojpa.entities.Staff;

public class ZooJPA {
public static void main(String[] args)
{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ZooJPA");
	EntityManager em= emf.createEntityManager();
	//Create
	em.getTransaction().begin();
	Staff staff = new Staff();
	staff.setName("Dudedtte");
	staff.setAge(24);
	staff.setGender("M");
	staff.setSalary(2015);
	em.persist(staff);
	em.getTransaction().commit();
	
	//Read
//	Staff staff1= em.find(Staff.class,2);
//	System.out.println("Staff Name is:"+staff1.getName());
	
	//Update
//	em.getTransaction().begin();
//	Staff staff2 = em.find(Staff.class, 2);
//	staff.setSalary(2500);
//	em.getTransaction().commit();
	
	//Delete
//	em.getTransaction().begin();
//	Staff staff3 = em.find(Staff.class, 2);
//	em.remove(staff);
//	em.getTransaction().commit();
	
	//Terminate Objects
	em.close();
	emf.close();
}
}
