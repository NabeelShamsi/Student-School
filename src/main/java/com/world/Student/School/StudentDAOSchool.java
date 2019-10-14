package com.world.Student.School;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAOSchool {
	
	Session session = Util.getSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
	
	List student = session.createQuery("From Student").list();
	for (Iterator iterator = Student.iterator(); iterator.hasnext();) {
	Student student = (Student) iterator.next();
	System.out.println("Student ID" + student.getStudentID());
	System.out.println("Student Name" + student.getStudentName());
	System.out.println("School ID" + student.getSchoolID());
	School add = student.getSchool();
	System.out.println("\t School Name" + add.getSchoolName());
	System.out.println("\t Number of Students" + add.getNumberOfStudents());
		}
		
	tx.commit();
	session.close();
	
}
