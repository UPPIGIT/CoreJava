package colletion.HashMapDemo;

import java.util.Comparator;

public class AccountClass extends Account implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getAccNo().compareTo(o2.getAccNo());
	}

	

}
