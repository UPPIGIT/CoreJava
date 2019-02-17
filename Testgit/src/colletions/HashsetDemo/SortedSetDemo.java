package colletions.HashsetDemo;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*public interface java.util.SortedSet<E> extends java.util.Set<E> {
	  public abstract java.util.Comparator<? super E> comparator();
	  public abstract java.util.SortedSet<E> subSet(E, E);
	  public abstract java.util.SortedSet<E> headSet(E);
	  public abstract java.util.SortedSet<E> tailSet(E);
	  public abstract E first();
	  public abstract E last();
	  public java.util.Spliterator<E> spliterator();*/

public class SortedSetDemo {

	public static StroreEmployeeDetails details = new StroreEmployeeDetails();

	public static void main(String[] args) {

		TreeSet<Employee> employees = details.getEmployee();
		Iterator<Employee> iterator = employees.iterator();

		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);

		}

		System.out.println(employees.comparator()); /* return null for default natural sorting */

		System.out.println("subset example.....subset(b true,e false)");

		/* Note java.lang.IllegalArgumentException if passed args seq wrong */

		SortedSet<Employee> subSet = employees.subSet(new Employee(1004, "empName", 10.5d),
				new Employee(1007, "empName", 10.5d));
		Iterator<Employee> subsetIterator = subSet.iterator();
		while (subsetIterator.hasNext()) {
			Employee employee = (Employee) subsetIterator.next();
			System.out.println(employee);
		}

		System.out.println("first and last elements :");

		System.out.println("first employee : " + employees.first());
		System.out.println("last employee : " + employees.last());

		System.out.println("head set eample ............");/* returns lower values excluding given value */
		SortedSet<Employee> headSet = employees.headSet(new Employee(1008, "empName", 10.5d));
		Iterator<Employee> headSetIterator = headSet.iterator();
		while (headSetIterator.hasNext()) {
			Employee employee = (Employee) headSetIterator.next();
			System.out.println(employee);

		}

		System.out.println("tail set example..................");/* returns higher values including given value */

		SortedSet<Employee> tailSet = employees.tailSet(new Employee(1010, "empName", 10.5d));

		Iterator<Employee> tailSetIterator = tailSet.iterator();
		while (tailSetIterator.hasNext()) {
			Employee employee = (Employee) tailSetIterator.next();
			System.out.println(employee);

		}
		
	

	}

}
