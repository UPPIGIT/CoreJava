package colletion.HashMapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

/*public interface java.util.SortedMap<K, V> extends java.util.Map<K, V> {
  public abstract java.util.Comparator<? super K> comparator();
  public abstract java.util.SortedMap<K, V> subMap(K, K);
  public abstract java.util.SortedMap<K, V> headMap(K);
  public abstract java.util.SortedMap<K, V> tailMap(K);
  public abstract K firstKey();
  public abstract K lastKey();
  public abstract java.util.Set<K> keySet();
  public abstract java.util.Collection<V> values();
  public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();*/

public class SortedMapDemo {

	public static TreeMap<Account, Customer> map = new TreeMap<>(new AccountClass());

	public static void main(String[] args) {

		for (int i = 0; i < 15; i++) {

			map.put(new AccountDetails().getAccountDetails(), new CustomerDetails().getCustomerDetails());

		}

		map.put(new Account(10120, "Aadhya", 100100.00), new Customer("pune", "MH", "India"));
		map.put(new Account(10136, "Sruthi", 200100.00), new Customer("pune", "MH", "India"));
		Set<Entry<Account, Customer>> entries = map.entrySet();

		Iterator<Entry<Account, Customer>> iterator = entries.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Account, Customer> entry = (Map.Entry<Account, Customer>) iterator.next();

			System.out.println(entry);

		}

		System.out.println("submap example................");

		SortedMap<Account, Customer> sortedMap = map.subMap(new Account(10123, "abc", 10.00d),
				new Account(10127, "xyz", 20.00d));

		/*
		 * SortedMap<Account, Customer> sortedMap = map.subMap(new Account(10123,
		 * "Aadhya", 100100.00), new Account(10129, "Aadhya", 100100.00));
		 */

		Set<Entry<Account, Customer>> entries2 = sortedMap.entrySet();

		Iterator<Entry<Account, Customer>> iterator2 = entries2.iterator();

		while (iterator2.hasNext()) {
			Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer> entry = (Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer>) iterator2
					.next();

			System.out.println(entry);

		}

		System.out.println("headmap example");

		Set<Entry<Account, Customer>> headMap = map.headMap(new Account(10136, "Sruthi", 200100.00)).entrySet();
		Iterator<Entry<Account, Customer>> iterator3 = headMap.iterator();

		while (iterator3.hasNext()) {
			Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer> entry = (Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer>) iterator3
					.next();

			System.out.println(entry);

		}

		System.out.println("tail map example............");

		Iterator<Entry<Account, Customer>> iterator4 = map.tailMap(new Account(10136, "Sruthi", 200100.00)).entrySet()
				.iterator();

		while (iterator4.hasNext()) {
			Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer> entry = (Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer>) iterator4
					.next();

			System.out.println(entry);

		}

		System.out.println("firest and last account details............");
		
		System.out.println("first account :"+map.firstKey());
		System.out.println("last account :"+ map.lastKey());
	}
}
