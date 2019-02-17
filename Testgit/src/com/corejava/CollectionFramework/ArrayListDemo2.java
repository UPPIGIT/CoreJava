package com.corejava.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("five");
		list.add("six");
		list.add("seven");
		
		System.out.println(list);
		
		list.add(1, "inserted at 1");
		list.add(4, "inserted at fourth");
		
		System.out.println(list);
		
		list.remove(4);
		list.remove("seven");
		System.out.println(list);
		
		list.set(3, "Replaced at 3");
		System.out.println(list);
		
		

	}

}
