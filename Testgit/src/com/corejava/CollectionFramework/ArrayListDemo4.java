package com.corejava.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo4 {


	public static void main(String[] args) {

		// Constructors

		ArrayList<Integer> arrayList = new ArrayList<>();

		ArrayList<Integer> arrayList2 = new ArrayList<>(20);

		ArrayList<Integer> arrayList3 = new ArrayList<>(arrayList);

		/**************************/

		arrayList.ensureCapacity(5);

		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10);

		System.out.println(arrayList);

		arrayList.trimToSize();

		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList2.isEmpty());
		System.out.println(arrayList3.isEmpty());

		System.out.println(arrayList.contains(10));
		System.out.println(arrayList.contains(100));

		System.out.println(arrayList2.contains(10));

		System.out.println(arrayList.indexOf(10));
		System.out.println(arrayList.indexOf(10));

		System.out.println(arrayList.indexOf(100));
		System.out.println(arrayList.indexOf(100));

		Object[] array = arrayList.toArray();

		for (Object integer : array) {
			System.out.println(integer);
		}

		List<Integer> sublist = arrayList.subList(3, 7);
		
		System.out.println(sublist);
		
		sublist.add(1, 400);
		sublist.add(4, 500);
		
		System.out.println(arrayList);
		System.out.println(sublist);
		
		/*add array to list */
		
		Integer[] integers = new Integer[] {17,18,19,94,45,66};
	
		List<Integer> arrayList4= Arrays.asList(integers);
		arrayList2.addAll(arrayList4);
		
		System.out.println(arrayList2);
		
		arrayList3.addAll(Arrays.asList(integers));
		
		System.out.println(arrayList3);
		
		Collections.addAll(arrayList3, integers);
		System.out.println(arrayList3);
		
		Object[] integers2 = new Integer[arrayList3.size()];
		
		integers2 = arrayList3.toArray();
		 for (Object object : integers2) {
			 System.out.println(object);
		}
		
		 Integer[] integers3 = new Integer[arrayList2.size()];
		 arrayList2.toArray(integers3);
		for (Integer integer : integers3) {
			System.out.println(integer);
			
		}
		 

	}

}
