package colletions.HashsetDemo;

import java.util.Iterator;

public class TreeSetDemo {

	static StroreEmployeeDetails details = new StroreEmployeeDetails();
	public static void main(String[] args) {

		

		Iterator<Employee> iterator = details.getEmployee().iterator();
		
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			
			System.out.println(employee);
			
		}

	}

}

