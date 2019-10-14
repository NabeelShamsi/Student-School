package com.world.Student.School;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class School {

	@Id
	private int schoolID;
	private String schoolName;
	private int numberOfStudents;
	@OneToMany(mappedBy = "School", cascade = CascadeType.ALL)
	@JoinColumn(name = "SchoolID")
	private List<Student> student = new ArrayList<Student>();
	/**
	 * @return the schoolID
	 */
	public int getSchoolID() {
		return schoolID;
	}
	/**
	 * @param schoolID the schoolID to set
	 */
	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}
	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}
	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	/**
	 * @return the numberOfStudents
	 */
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	/**
	 * @param numberOfStudents the numberOfStudents to set
	 */
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	/**
	 * @return the student
	 */
	public List<Student> getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "School [schoolID=" + schoolID + ", schoolName=" + schoolName + ", numberOfStudents=" + numberOfStudents
				+ ", student=" + student + "]";
	}
	public static Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}
