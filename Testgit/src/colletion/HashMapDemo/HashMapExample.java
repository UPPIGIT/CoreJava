package colletion.HashMapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {


	public static HashMap<Account, Customer> hashMap = new HashMap<>();

	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {

			hashMap.put(new AccountDetails().getAccountDetails(), new CustomerDetails().getCustomerDetails());

		}

		Set<Entry<Account, Customer>> entries = hashMap.entrySet();

		Iterator<Entry<Account, Customer>> iterator = entries.iterator();

		while (iterator.hasNext()) {
			Map.Entry<Account, Customer> entry = (Map.Entry<Account, Customer>) iterator.next();
			
			System.out.println(entry);

		}

	}

}
