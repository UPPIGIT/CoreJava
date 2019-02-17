package colletions.list.StudentDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UI {

	int ch;
	StudentOperations operations = new StudentOperations();
	Scanner scanner = new Scanner(System.in);

	public UI() {
		menu();
	}

	public void showScreen() {
		System.out.println("1. All student details");
		System.out.println("2. Get student using Id");
		System.out.println("3. Remove student using id");
		System.out.println("4. Add new Student");
		System.out.println("0 Exit ");

	}

	public void getUserInput() {

		ch = scanner.nextInt();
	}

	public void addStudentDetails() {
		System.out.println("Please enter Student details : ");
		System.out.println("Student name : ");
		String name = scanner.next();
		System.out.println("Student Id : ");
		int id = scanner.nextInt();
		System.out.println("Student marks : ");
		int marks = scanner.nextInt();
		System.out.println("Student Grade : ");
		String grade = scanner.next();

		if (operations.addNewStudent(new Student(id, name, 10, 745, grade))) {
			System.out.println("Student added successfully.......");
		}

	}

	public void getStudentDetails() {
		System.out.println("Please enter Student Id : ");
		int stid = scanner.nextInt();
		System.out.println("Student details here : " + operations.getStudentByID(stid));

	}

	public void getAllStudentDetails() {
		List<Student> list = operations.getAllStudent();
		Iterator<Student> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println("student Name  : "+student.getStName());
			System.out.println("Student Id    : " + student.getStId());
			System.out.println("student class : "+student.getStClass());
			System.out.println("Student marks : " + student.getStMarks());
			System.out.println("Student Grade : " + student.getStGrade());
			System.out.println("******************************************");
			
			
		}
		
		System.out.println("Total no of student in school is : "+ list.size());

	}

	public void removeStudent() {
		System.out.println("Please enter Student Id : ");
		int stid = scanner.nextInt();
		System.out.println("Student removed : " + operations.removeStudentById(stid));

	}

	public void menu() {

		do {

			showScreen();
			getUserInput();

			switch (ch) {
			case 1:
				getAllStudentDetails();
				break;

			case 2:
				getStudentDetails();
				break;
			case 3:
				removeStudent();
				break;	

			case 4:
				addStudentDetails();
				break;

			case 0:
				System.out.println("Thank you.......");
				System.exit(0);
				
				break;

			default:
				System.out.println("Invalid entry..");
				menu();
				break;
			}

		} while (ch != 0);
	}

}
