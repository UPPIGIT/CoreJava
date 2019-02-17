package colletions.list.StudentDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import collections.ShoppingCart.Main;

public class StudentDetails {

	private ArrayList<Student> studentsArrayList = new ArrayList<>();

	public StudentDetails() {

		this.storeStudents();

	}

	public List<Student> getStudents() {
		return studentsArrayList;
	}

	public void storeStudents() {

		for (int j = 0; j < 11; j++) {

			String name = "aadhyashreshtasruthimanirishiakshra";
			int N = name.length();
			StringBuffer buffer = new StringBuffer();
			Random random = new Random();

			for (int i = 0; i < 6; i++) {

				buffer.append(name.charAt(random.nextInt(N)));

			}

			name = buffer.toString();
			Integer id = random.nextInt(100);
			Integer marks = random.nextInt(1000);
			String grade;

			if (marks >= 800) {
				grade = "A";
			} else if (marks >= 400) {
				grade = "B";
			} else {
				grade = "C";
			}

			this.studentsArrayList.add(new Student(id, name, 10, marks, grade));

		}

	

		}

	public static void main(String[] args) {
		
		System.out.println(new StudentDetails().getStudents());

	}

}
