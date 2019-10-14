package com.world.Student.School;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class studentDAOdelete {

	
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
	    //Serializable id = new Long(2);
	    Object persistentInstance = session.load(Student.class, studentID);
	    if (persistentInstance != null) {
	    session.delete(persistentInstance);
	    System.out.println("Student was removed");
	    }	      
		tx.commit();
		session.close();
	
}
