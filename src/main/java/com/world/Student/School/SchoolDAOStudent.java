package com.world.Student.School;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SchoolDAOStudent {
	
	Session session = Util.getSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
	
	List student = session.createQuery("From Student").list();
	for (Iterator iterator = Student.iterator(); iterator.hasnext();) {
	School school = (School) iterator.next();
	System.out.println("School ID" + school.getSchoolID());
	System.out.println("School Name" + school.getSchoolName());
	System.out.println("Namber of Students" + school.getNumberOfStudents());
	Student add = (Student) school.getStudent();
	System.out.println("\t Student ID" + add.getStudentID());
	System.out.println("\t Student Name" + add.getStudentName());
	}
	
	tx.commit();
	session.close();
	
}
