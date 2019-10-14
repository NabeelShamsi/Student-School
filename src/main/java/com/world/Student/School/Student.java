package com.world.Student.School;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id 
	private int studentID;
	private String studentName;
	private int schoolID;
	@OneToOne
	@JoinColumn(name = "SchoolID")
	private School school;
	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
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
	 * @return the school
	 */
	public School getSchool() {
		return school;
	}
	/**
	 * @param school the school to set
	 */
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", schoolID=" + schoolID
				+ ", school=" + school + "]";
	
	}
		
	public static Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
	
	

