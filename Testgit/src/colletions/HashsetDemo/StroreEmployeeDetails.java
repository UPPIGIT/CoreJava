package colletions.HashsetDemo;

import java.util.Random;
import java.util.TreeSet;

public class StroreEmployeeDetails {
	
	public Employee employee =null;
//	public TreeSet<Employee> treeSet = new TreeSet<>();
	public TreeSet<Employee> treeSet = new TreeSet<>(new MyComparator());
	
	public StroreEmployeeDetails()
	{
		storeEmployeDetails();
	}
	
	public TreeSet<Employee> getEmployee()
	{
		return treeSet;
	}
	
	public void storeEmployeDetails()
	{
		
		
		
		for (int i = 1; i < 14; i++) {
			

			String name ="aadhyashrishasruthishresha";
			int N= name.length();
			StringBuffer buffer = new StringBuffer();
			Random random = new Random();

			for (int j = 1; j< 6; j++) {
				buffer.append(name.charAt(random.nextInt(N)));
				
			}
			
			name = buffer.toString();
			
			Double sal = random.nextInt(500)*1000.00+1;
			
			
			treeSet.add(new Employee(1000+i, name, sal));
		} 
		
	}

}
