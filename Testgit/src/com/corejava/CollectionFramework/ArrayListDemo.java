package com.corejava.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		System.out.println(arrayList.size());
		arrayList.remove(1);
		System.out.println(arrayList.size());
		arrayList.remove(Integer.valueOf(30));
		System.out.println(arrayList.size());
		
		/*allow null and any no of times*/
		arrayList.add(1, null);
		arrayList.add(null);
		arrayList.add(null);
		System.out.println(arrayList);
		
		/*allow duplicates*/
		arrayList.add(100);
		arrayList.add(100);
		arrayList.add(100);
		arrayList.add(100);
		System.out.println(arrayList);
		arrayList.set(5, 200);
		System.out.println(arrayList); // replace element
		
		System.out.println(arrayList.indexOf(200));
		
	}

}

