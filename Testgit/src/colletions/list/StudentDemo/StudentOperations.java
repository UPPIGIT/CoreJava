package colletions.list.StudentDemo;

import java.util.List;
import java.util.ListIterator;

public class StudentOperations {

	StudentDetails details = new StudentDetails();
	Student student = null;

	public List<Student> getAllStudent() {
		return details.getStudents();
	}

	public Student getStudentByID(int stid) {

		List<Student> students = this.getAllStudent();
		
		for (Student student : students) {
			if (student.getStId()==stid) {
				return student;
			}
			
		}
		
			if(student==null) {
				System.out.println("No student found with this id");
			}
		return student;

		}

	

	public Boolean removeStudentById(int stid) {
		student = getStudentByID(stid);
		return getAllStudent().remove(student);
	}

	public Boolean addNewStudent(Student student) {
		return getAllStudent().add(student);
	}

}
