package colletion.HashMapDemo;


import java.util.Random;

public class AccountDetails {
	
	Random random = new Random();

	Integer accNum=10123+Integer.valueOf(random.nextInt(15));
	String name;
	Double Bal;
	public AccountDetails() {
		storeAccountDetails();
	}
	
	public Account getAccountDetails()
	{
		return new Account(accNum, name, Bal);
	}

	public void storeAccountDetails() {

		

	
			name = "aadhyaShrishaSruthiuppiShreshta";
			int N = name.length();
			StringBuffer buffer = new StringBuffer();
			

			for (int j = 0; j < 5; j++) {
				buffer.append(name.charAt(random.nextInt(N)));
				

			}
			
		
			
			
			this.name = buffer.toString();
			this.Bal = random.nextInt(100) * 125.00 + 15;

			

		}
	}


