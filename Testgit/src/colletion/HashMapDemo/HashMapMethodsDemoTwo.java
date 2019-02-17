package colletion.HashMapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethodsDemoTwo {
	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		for (int i = 1; i < 6; i++) {
			hashMap.put(i, "H" + i);

		}

		Set<Entry<Integer, String>> entries = hashMap.entrySet();

		Iterator<Entry<Integer, String>> iterator = entries.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();

			System.out.println(entry.getKey() + "  " + entry.getValue());

		}

		System.out.println(hashMap.putIfAbsent(1, "H6"));

		System.out.println(hashMap);

		System.out.println(hashMap.putIfAbsent(7, "H7"));

		System.out.println(hashMap);

		System.out.println(hashMap.get(7));
		System.out.println(hashMap.get(5));
		System.out.println(hashMap.get(14));

		System.out.println(hashMap.containsKey(7));
		System.out.println(hashMap.containsKey(14));

		System.out.println(hashMap.containsValue("H7"));
		System.out.println(hashMap.containsValue("H15"));

		System.out.println("Size :" + hashMap.size());

		System.out.println("before remove :" + hashMap);

		System.out.println(hashMap.remove(1, "H1"));
		System.out.println(hashMap.remove(2, "H5"));
		System.out.println("after remove :" + hashMap);

		System.out.println("before replace :" + hashMap);
		System.out.println(hashMap.replace(3, "H333"));
		System.out.println(hashMap.replace(10, "h2"));
		System.out.println(hashMap.replace(4, "H4", "H444"));
		System.out.println("After replace :" + hashMap);

		Map<Integer, String> suncMap = Collections.synchronizedMap(hashMap);
	}
}
