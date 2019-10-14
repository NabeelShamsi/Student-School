package school.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import school.Util;
import school.entities.School;
import school.entities.Student;

public class SchoolDAO {
	
	public School getSchoolByName(String schoolName) {
		
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		School school = session.createQuery("select * from school where schoolName=" + schoolName, School.class).getSingleResult();
		
		tx.commit();
		session.close();
		return school;	
		
	}
	
	public List<School> getAllSchools() {
		
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		List<School> schools = session.createQuery("from School").getResultList();
		
		tx.commit();
		session.close();
		return schools;
		
	}
	
	public void deleteSchool(String schoolName) {
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		School school = getSchoolByName(schoolName);
		new StudentDAO().deleteAllStudents(school);
		session.createQuery("delete from school where schoolID=" + school.getSchoolID());
		tx.commit();
		session.close();
	}
}
