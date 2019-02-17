package colletions.HashsetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Customer> customers = new LinkedHashSet<>();
		customers.add(new Customer(101, "abc"));
		customers.add(new Customer(102, "prq"));
		customers.add(new Customer(103, "lmn"));
		customers.add(new Customer(104, "xyz"));
		customers.add(new Customer(105, "aaa"));
		customers.add(new Customer(106, "ddd"));
		customers.add(new Customer(107, "hhh"));
		customers.add(new Customer(101, "yyy"));
		customers.add(new Customer(102, "aaa"));

		Iterator<Customer> iterator = customers.iterator();
		
		//customers.add(new Customer(110, "hhh")); java.util.ConcurrentModificationException
		
		
		while (iterator.hasNext()) {
			Customer customer = (Customer) iterator.next();
			System.out.println(customer);
			
		}

	}

}
