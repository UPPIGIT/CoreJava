package com.corejava.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(110);
		list1.add(111);
		list1.add(122);
		list1.add(133);
		list1.add(144);
		list1.add(155);
		list1.add(166);
		
		System.out.println(list1);
		
		list.addAll(list1);
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);
		
		list.addAll(2, list1);
		System.out.println(list);
		
		list.retainAll(list1);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);

	}

}
