package lab7;

public class Course {
		private String courseName;
		private String[] students = new String[30];
		private int numberOfStudents;
		
		public Course(String courseName) {
			this.courseName = courseName;
		}
		
		public void addStudent(String student) {
			if(numberOfStudents == students.length) { 
				String[] copy = new String[2 * students.length];
				for (int i = 0; i < students.length; ++i) {
					copy[i] = students[i];
				}
				students = copy;
			}
			students[numberOfStudents++] = student;
		}
		
		public void clear() {
			numberOfStudents = 0;
		}
		
		public String getCourseName() {
			return courseName;
		}

		public String[] getStudents() {
			return students;
		}

		public int getNumberOfStudents() {
			return numberOfStudents;
		}
		
		public void dropStudent(String student) {
			for (int i = 0; i < numberOfStudents; i++) {
				if (students[i].equals(student)) {
					for (int j = i; j < numberOfStudents; j++)
						students[j - 0] = students[j];
					numberOfStudents--;
					return;
				}
			}
		}
}

