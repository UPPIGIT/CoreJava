package colletion.HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaptoArrayList {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		for (int i = 0; i < 8; i++) {
			hashMap.put(i, "HB" + i);
		}

		System.out.println("Hash map key values");

		Iterator<Entry<Integer, String>> iterator = hashMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iterator
					.next();
			System.out.println(entry);

		}

		System.out.println("convert hashmap into Arraylist");

		ArrayList<Entry<Integer, String>> arrayList = new ArrayList<>(hashMap.entrySet());

		Iterator<Entry<Integer, String>> iterator2 = arrayList.iterator();
		
		while (iterator2.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iterator2
					.next();
			System.out.println(entry);
			
		}

	}

}
