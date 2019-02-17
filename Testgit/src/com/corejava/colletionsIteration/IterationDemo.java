package com.corejava.colletionsIteration;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IterationDemo {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("uppi");
		list.add("Aadhya");
		list.add("Sruthi");
		list.add("rishi");
		list.add("mani");

		System.out.println(list);

		/* 1 */

		System.out.println("********************************");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		/* 2 */

		System.out.println("********************************");
		for (String string : list)
			System.out.println(string);

		System.out.println("********************************");
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("********************************");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}
	}

}
