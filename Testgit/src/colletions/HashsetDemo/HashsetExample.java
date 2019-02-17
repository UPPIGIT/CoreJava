package colletions.HashsetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {

		HashSet<Student> hashSet = new HashSet<>();

		hashSet.add(new Student(10, "upender", 500, "A"));
		hashSet.add(new Student(11, "ravi", 400, "A"));
		hashSet.add(new Student(12, "sai", 350, "A"));
		hashSet.add(new Student(13, "ganesh", 600, "A"));
		hashSet.add(new Student(14, "abc", 450, "A"));
		hashSet.add(new Student(15, "xyz", 520, "A"));
		hashSet.add(new Student(15, "lmn", 600, "A"));
		hashSet.add(new Student(10, "upender", 500, "A"));
		hashSet.add(new Student(11, "ravi", 400, "A"));

		Iterator<Student> iterator = hashSet.iterator();
		
		//hashSet.add(new Student(22, "ganesh", 600, "A")); java.util.ConcurrentModificationException

		while (iterator.hasNext()) {
			
			Student student =iterator.next();
			
			System.out.println(student);

		}

	}
}