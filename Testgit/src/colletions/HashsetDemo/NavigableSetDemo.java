package colletions.HashsetDemo;

/*public interface java.util.NavigableSet<E> extends java.util.NavigableSet<E> {
  public abstract E lower(E);
  public abstract E floor(E);
  public abstract E ceiling(E);
  public abstract E higher(E);
  public abstract E pollFirst();
  public abstract E pollLast();
  public abstract java.util.Iterator<E> iterator();
  public abstract java.util.NavigableSet<E> descendingSet();
  public abstract java.util.Iterator<E> descendingIterator();
  public abstract java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
  public abstract java.util.NavigableSet<E> headSet(E, boolean);
  public abstract java.util.NavigableSet<E> tailSet(E, boolean);
  public abstract java.util.NavigableSet<E> subSet(E, E);
  public abstract java.util.NavigableSet<E> headSet(E);
  public abstract java.util.NavigableSet<E> tailSet(E);*/


import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static StroreEmployeeDetails details = new StroreEmployeeDetails();

	public static void main(String[] args) {

		TreeSet<Employee> employees = details.getEmployee();

		Iterator<Employee> iterator = employees.iterator();
		
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
			
		}
		
		System.out.println(" floor and lower  examples");
		System.out.println("floor :" + employees.floor(new Employee(1020, "empName", 10.5d)));/*<=e*/
		System.out.println("lower :"+employees.lower(new Employee(1005, "empName", 10.5d)));/*<e*/
		
		
		System.out.println("ceiling "+employees.ceiling(new Employee(1009, "empName", 10.5d)));/*>=e*/
		System.out.println("higher "+employees.higher(new Employee(1009, "empName", 10.5d)));/*>e*/
		
		System.out.println("head set eample ............");/* returns lower values excluding given value if false */
		NavigableSet<Employee> headSet = employees.headSet(new Employee(1008, "empName", 10.5d),false);
		Iterator<Employee> headSetIterator = headSet.iterator();
		while (headSetIterator.hasNext()) {
			Employee employee = (Employee) headSetIterator.next();
			System.out.println(employee);

		}

		System.out.println("tail set example..................");/* returns higher values including given value if true*/

		NavigableSet<Employee> tailSet = employees.tailSet(new Employee(1010, "empName", 10.5d),false);

		Iterator<Employee> tailSetIterator = tailSet.iterator();
		while (tailSetIterator.hasNext()) {
			Employee employee = (Employee) tailSetIterator.next();
			System.out.println(employee);

		}
		
		System.out.println("subset example.....subset(b true/false,e true/false)");

		/* Note java.lang.IllegalArgumentException if passed args seq wrong */

		NavigableSet<Employee> subSet = employees.subSet(new Employee(1004, "empName", 10.5d),false,
				new Employee(1007, "empName", 10.5d),true);
		Iterator<Employee> subsetIterator = subSet.iterator();
		while (subsetIterator.hasNext()) {
			Employee employee = (Employee) subsetIterator.next();
			System.out.println(employee);
		}

	}

}
