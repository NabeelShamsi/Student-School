package com.world.Student.School;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAOcreate {
	
public Student createStudent(int studentID, String studentName, int schoolID){
		
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Student student1 = new Student();
		
		student1.setStudentID(studentID);
		student1.setStudentName(studentName);
		student1.setSchoolID(schoolID);
						
		session.save(student1);
		
		School numberOfStudents1 = new School();
		
			int n = numberOfStudents1.getNumberOfStudents(schoolID);
			int	n2 = n + 1;
				numberOfStudents1.setNumberOfStudents(n2);
				
				session.save(n2);

		tx.commit();
		session.close();
		return student1;
}

}
