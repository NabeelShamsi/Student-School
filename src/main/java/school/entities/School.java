package school.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int schoolID;
	private String schoolName;
	@OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
	private List<Student> students = new ArrayList<Student>();

	/**
	 * @return the schoolID
	 */
	public int getSchoolID() {
		return schoolID;
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
	 * @return the student
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "School [schoolID=" + schoolID + ", schoolName=" + schoolName 
				+ ", student=" + students + "]";
	}

}
