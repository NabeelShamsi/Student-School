package school;

import com.world.Student.School.SchoolDAOStudent;
import com.world.Student.School.StudentDAOSchool;
import com.world.Student.School.studentDAOdelete;

import school.dao.SchoolDAO;
import school.dao.StudentDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	new StudentDAOSchool();
    	
    	new SchoolDAOStudent();	
    	
    	new SchoolDAO();
    	
    	new StudentDAO();
    	
    	new studentDAOdelete();
    	
    	    	
    }
}
