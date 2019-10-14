package school;

import java.util.List;

import school.dao.SchoolDAO;
import school.dao.StudentDAO;
import school.entities.School;
import school.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student newStudent = new StudentDAO().createStudent("Samira1", "Jubail Academy");
    	System.out.println(newStudent);
    	
    	new StudentDAO().deleteStudent("Samira1");
    	
    	List<Student> newStudent2 = new StudentDAO().getAllStudents();
    	
    	Student newStudent3 = new StudentDAO().updateStudentSchool("Samira1", "Fair Feild High School");
    	
    	new SchoolDAO().deleteSchool("Beacon House School System"); 
    	
    	List<School> newSchool1 = new SchoolDAO().getAllSchools();
    	
    	}
}
