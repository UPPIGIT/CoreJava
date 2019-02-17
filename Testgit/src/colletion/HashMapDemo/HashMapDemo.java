package colletion.HashMapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		for (int i = 1; i < 6; i++) {

			map.put(i, "H" + i);

		}

		System.out.println(map);

		System.out.println(map.put(7, "H10"));
		System.out.println(map);

		System.out.println(map.put(7, "H12")); // return if any value already present with this key..if no null
		System.out.println(map);

		System.out.println(map.put(8, "H13")); // values can be duplicate
		System.out.println(map.put(9, "H13"));
		System.out.println(map.put(10, "H13"));
		System.out.println(map);

		System.out.println(map.put(null, "H14")); // only one null key allowed for key
		System.out.println(map.put(null, "H15"));
		System.out.println(map.put(null, "H16"));

		System.out.println(map);

		System.out.println(map.put(11, null)); // we can insert value as null any no of times
		System.out.println(map.put(12, null));
		System.out.println(map.put(12, null));

		System.out.println("Display all keys in map..........................");

		Set<Integer> keySet = map.keySet();

		Iterator<Integer> iterator = keySet.iterator();

		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);

		}

		System.out.println("Display all values in key");

		Collection<String> listofvalues = map.values();

		Iterator<String> iterator2 = listofvalues.iterator();
		
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}

	}

}
