package school;

import school.dao.StudentDAO;
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
    	    	
    }
}
