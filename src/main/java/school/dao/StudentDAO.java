package school.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import school.Util;
import school.entities.School;
import school.entities.Student;

public class StudentDAO {

	public Student createStudent(String studentName, String schoolName) {

		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Student student = new Student();
		School school = new SchoolDAO().getSchoolByName(schoolName);
		student.setStudentName(studentName);
		student.setSchool(school);

		session.save(student);
		tx.commit();
		session.close();
		return student;
	}

	public Student updateStudentSchool(String studentName, String schoolName) {

		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		School school = new SchoolDAO().getSchoolByName(schoolName);

		Student student = getStudentByName(studentName);
		student.setSchool(school);
		session.save(student);
		tx.commit();
		session.close();
		return student;

	}

	public Student getStudentByName(String studentName) {
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Student student = session.createQuery("select * from student where studentName=" + studentName, Student.class)
				.getSingleResult();
		tx.commit();
		session.close();
		return student;
	}

	public void deleteAllStudents(School school) {
		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.createQuery("delete from student where schoolID=" + school.getSchoolID());
		tx.commit();
		session.close();

	}

	public void deleteStudent(String studentName) {

		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.createQuery("delete from student where studentName=" + studentName);
		tx.commit();
		session.close();
	}

	public List<Student> getAllStudents() {

		Session session = Util.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		List<Student> students = session.createQuery("from Student").getResultList();

		tx.commit();
		session.close();
		return students;
	}
}
