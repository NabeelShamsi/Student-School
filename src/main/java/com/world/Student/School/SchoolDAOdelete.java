package com.world.Student.School;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.*;

public class SchoolDAOdelete {
	
public School deleteStudent(int schoolID){
	
	
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
	    //Serializable id = new Long(2);
	    Object persistentInstance = session.load(School.class, schoolID);
	    if (persistentInstance != null) {
	    session.delete(persistentInstance);
	    System.out.println("School was removed");
	    
	    }
	    
		tx.commit();
		session.close();
		
		Session session1 = Util.getSessionFactory().openSession();
		Transaction tx1 = session.beginTransaction();
		
		Query q = session1.createQuery("Select count(schoolID) from Student");
		int u=q;
		
		//Serializable id = new Long(2);
		for(int i=0; i<=u; i++){
	    Object persistentInstance1 = session.load(Student.class, schoolID);
	      if (persistentInstance1 != null) {
	      session.delete(persistentInstance);
	      System.out.println("Student was removed");
	    }
	}
}
}
