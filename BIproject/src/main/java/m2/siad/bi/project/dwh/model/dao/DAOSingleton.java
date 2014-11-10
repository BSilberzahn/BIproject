package m2.siad.bi.project.dwh.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DAOSingleton {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
	private static EntityManager em;
	
	//private Constructor
	private DAOSingleton(){
		try {
			em = emf.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//return the instance
	public static EntityManager openConnection(){
		if(em == null){
			new DAOSingleton();
		}
		return em;  
	}   
}
