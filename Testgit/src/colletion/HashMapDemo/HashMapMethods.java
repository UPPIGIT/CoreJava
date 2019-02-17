package colletion.HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {

		/* HashMap cons */

		HashMap<Integer, String> hashMap = new HashMap<>();

		HashMap<Integer, String> hashMap2 = new HashMap<>(30);

		HashMap<Integer, String> hashMap3 = new HashMap<>(30, 005f);

		HashMap<Integer, String> hashMap4 = new HashMap<>(hashMap);

		for (int i = 0; i < 6; i++) {
			hashMap.put(i, "H" + i);

		}

		Set<Entry<Integer, String>> entrySet = hashMap.entrySet();

		Iterator<Entry<Integer, String>> entrySetIterator = entrySet.iterator();

		while (entrySetIterator.hasNext()) {
			Entry<Integer, String> entry = entrySetIterator.next();
			System.out.println("Key :" + entry.getKey() + "-----" + "Value :" + entry.getValue());

		}

		for (int i = 7; i < 14; i++) {
			hashMap2.put(i, "H" + i);

		}

		hashMap2.putAll(hashMap);

		Set<Entry<Integer, String>> entries = hashMap2.entrySet();
		Iterator<Entry<Integer, String>> iterator = entries.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator
					.next();
			System.out.println("Key :"+entry.getKey()+"  "+"Value :"+entry.getValue());
		}

	}

}
