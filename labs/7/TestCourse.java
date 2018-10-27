package lab7;
public class TestCourse {

	public static void main(String[] args) {
		Course course = new Course("CRSE");
		
		course.addStudent("Marco");
		course.addStudent("Fabian");
		course.addStudent("Stefan");
		
		course.dropStudent("Stefan");
		
		System.out.println("The students in the course are: ");
		for(int i = 0; i < course.getNumberOfStudents(); ++i) {
			System.out.println(course.getStudents()[i]);
		}
	}

}

