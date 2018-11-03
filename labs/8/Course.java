package lab8;
import java.util.ArrayList; 
public class Course { 
	private String courseName; 
	private ArrayList students = new ArrayList(); 
	private int numberOfStudents; 
	public Course(String courseName) { 
		this.courseName=courseName; 
	} 
	public void addStudent(String student) { 
		students.add(student); numberOfStudents++; 
	} 
	public ArrayList getStudents() { 
		return students; 
	} 
	public int getNumberOfStudents() { 
		return numberOfStudents; 
	} 
	public String getCouseName() { 
		return courseName; 
	} 
	public void dropStudent(String student) { 
	} 
}

