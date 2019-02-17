package colletions.HashsetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 10; i < 20; i++) {
			set.add(i);
		}
		
		System.out.println(set);
		
		System.out.println(set.add(15));
		set.add(null);
		System.out.println(set);
		
	Iterator<Integer> iterator	= set.iterator();
	
//	set.add(25);java.util.ConcurrentModificationException-- cant modify after iterator creation
	
	while (iterator.hasNext()) {
		Integer integer = (Integer) iterator.next();
		System.out.println(integer);
		
	}

	}

}
