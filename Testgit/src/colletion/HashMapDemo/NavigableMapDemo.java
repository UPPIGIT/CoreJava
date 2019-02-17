package colletion.HashMapDemo;

/*public interface java.util.NavigableMap<K, V> extends java.util.SortedMap<K, V> {                              public abstract java.util.Map$Entry<K, V> lowerEntry(K);
  public abstract K lowerKey(K);
  public abstract java.util.Map$Entry<K, V> floorEntry(K);
  public abstract K floorKey(K);
  public abstract java.util.Map$Entry<K, V> ceilingEntry(K);
  public abstract K ceilingKey(K);
  public abstract java.util.Map$Entry<K, V> higherEntry(K);
  public abstract K higherKey(K);
  public abstract java.util.Map$Entry<K, V> firstEntry();
  public abstract java.util.Map$Entry<K, V> lastEntry();
  public abstract java.util.Map$Entry<K, V> pollFirstEntry();
  public abstract java.util.Map$Entry<K, V> pollLastEntry();
  public abstract java.util.NavigableMap<K, V> descendingMap();
  public abstract java.util.NavigableSet<K> navigableKeySet();
  public abstract java.util.NavigableSet<K> descendingKeySet();
  public abstract java.util.NavigableMap<K, V> subMap(K, boolean, K, boolean);
  public abstract java.util.NavigableMap<K, V> headMap(K, boolean);
  public abstract java.util.NavigableMap<K, V> tailMap(K, boolean);
  public abstract java.util.SortedMap<K, V> subMap(K, K);
  public abstract java.util.SortedMap<K, V> headMap(K);
  public abstract java.util.SortedMap<K, V> tailMap(K);
  */

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class NavigableMapDemo {

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

		NavigableMap<Account, Customer> NavigableMap = map.subMap(new Account(10123, "abc", 10.00d),true,
				new Account(10127, "xyz", 20.00d),true);

		/*
		 * NavigableMap<Account, Customer> NavigableMap = map.subMap(new Account(10123,
		 * "Aadhya", 100100.00), new Account(10129, "Aadhya", 100100.00));
		 */

		Set<Entry<Account, Customer>> entries2 = NavigableMap.entrySet();

		Iterator<Entry<Account, Customer>> iterator2 = entries2.iterator();

		while (iterator2.hasNext()) {
			Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer> entry = (Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer>) iterator2
					.next();

			System.out.println(entry);

		}

		System.out.println("headmap example");

		Set<Entry<Account, Customer>> headMap = map.headMap(new Account(10136, "Sruthi", 200100.00),true).entrySet();
		Iterator<Entry<Account, Customer>> iterator3 = headMap.iterator();

		while (iterator3.hasNext()) {
			Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer> entry = (Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer>) iterator3
					.next();

			System.out.println(entry);

		}

		System.out.println("tail map example............");

		Iterator<Entry<Account, Customer>> iterator4 = map.tailMap(new Account(10136, "Sruthi", 200100.00),true).entrySet()
				.iterator();

		while (iterator4.hasNext()) {
			Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer> entry = (Map.Entry<colletion.HashMapDemo.Account, colletion.HashMapDemo.Customer>) iterator4
					.next();

			System.out.println(entry);

		}

		System.out.println("first and last account details............");

		System.out.println("first account :" + map.firstEntry());
		System.out.println("last account :" + map.lastEntry());
		
		System.out.println("floorEntry : "+map.floorEntry(new Account(10127, "Sruthi", 200100.00)));/*<=e*/
		System.out.println("lowerEntry : "+map.lowerEntry(new Account(10127, "Sruthi", 200100.00)));/*<e*/
		
		System.out.println("ceilingEntry :"+map.ceilingEntry(new Account(10127, "Sruthi", 200100.00)));/*>=e*/
		System.out.println("heigherEnrty  :"+map.higherEntry(new Account(10127, "Sruthi", 200100.00)));/*>e*/
		
	}

}
