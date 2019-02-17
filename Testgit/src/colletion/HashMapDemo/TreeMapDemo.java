package colletion.HashMapDemo;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {


	
	public static TreeMap<Account, Customer> map = new TreeMap<>();

	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {

			map.put(new AccountDetails().getAccountDetails(), new CustomerDetails().getCustomerDetails());

		}

		Set<Entry<Account, Customer>> entries = map.entrySet();

		Iterator<Entry<Account, Customer>> iterator = entries.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Account, Customer> entry = (Map.Entry<Account, Customer>) iterator.next();
			
			System.out.println(entry);

		}

	}

}
