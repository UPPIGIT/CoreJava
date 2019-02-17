package com.corejava.colletionsIteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*Difference Between Iterator And ListIterator In Java*/

public class ItetaratorAndListIteratorDemo {

	public static void main(String[] args) {

		/*
		 * Iterator Methods : boolean hasNext() –> Checks whether collection has more
		 * elements. E next() –> Returns the next element in the collection. void
		 * remove() –> Removes the current element in the collection i.e element
		 * returned by next().
		 */

		ArrayList<String> al = new ArrayList<>(Arrays.asList("abc", "xyz", "lmn", "pqr", "aaa"));
		System.out.println(al);

		Iterator<String> iterator = al.iterator();

		while (iterator.hasNext()) {

			String s = iterator.next();

			if (s.equals("lmn")) {
				iterator.remove();
				// al.add("bug");java.util.ConcurrentModificationException
			}
		}

		System.out.println(al);

		/*
		 * ListIterator Methods : boolean hasNext() –> Checks whether the list has more
		 * elements when traversing the list in forward direction. boolean hasPrevious()
		 * –> Checks whether list has more elements when traversing the list in backward
		 * direction. E next() –> Returns the next element in the list and moves the
		 * cursor forward. . E previous() –> Returns the previous element in the list
		 * and moves the cursor backward. int nextIndex() –> Returns index of the next
		 * element in the list. int previousIndex() –> Returns index of the previous
		 * element in the list. . void remove() –> Removes the current element in the
		 * collection i.e element returned by next() or previous().
		 *  void set(E e) –>
		 * Replaces the current element i.e element returned by next() or previous()
		 * with the specified element. 
		 * void add(E e) –> Inserts the specified element in
		 * the list.
		 */

		System.out.println("**************************************");
		ListIterator<String> iterator2 = al.listIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		LinkedList<Integer> al1 = new LinkedList<>(Arrays.asList(11, 12, 13, 14, 15, 15));

		System.out.println("**************************************");
		ListIterator<Integer> iterator3 = al1.listIterator();

		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
		while (iterator3.hasPrevious()) {
			System.out.println(iterator3.previous());

		}

		LinkedList<Integer> al2 = new LinkedList<>(Arrays.asList(14, 15, 46, 89, 23, 75, 90));

		ListIterator<Integer> iterator4 = al2.listIterator();

		while (iterator4.hasNext()) {
			System.out.println(iterator4.nextIndex() + " : " + iterator4.next());
		}

		System.out.println("************************************************");
		while (iterator4.hasPrevious()) {
			System.out.println(iterator4.previousIndex() + "  : " + iterator4.previous());
		}
		System.out.println("************************************************");
		LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("abc", "pqr", "xyz", "xxx", "mmm"));
		System.out.println(linkedList);
		ListIterator<String> iterator5 = linkedList.listIterator();
		while(iterator5.hasNext())
		{
			String name = iterator5.next();
			
			if (name.equals("abc")) {
				iterator5.set("Aadhay");
			} 
			
			if (name.equals("xxx")) {
				iterator5.remove();
			}
			
			if (name.equals("mmm")) {
				iterator5.add("mohan");
			}
		}
		System.out.println(linkedList);

	}

}
