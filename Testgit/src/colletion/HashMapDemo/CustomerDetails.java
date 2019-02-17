package colletion.HashMapDemo;


import java.util.Random;

public class CustomerDetails {

	String city;
	String state ;
	String country ;

	public CustomerDetails() {

		storeCustomerDetails();
	}
	
	public Customer getCustomerDetails()
	{
		return new Customer(city, state, country);
	}

	public void storeCustomerDetails() {

		String Cities = "punehyderbadmumbaivarangalnirmalnizamabad";
		int N = Cities.length();
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();


			for (int j = 0; j < 5; j++) {

				buffer.append(Cities.charAt(random.nextInt(N)));

			}
			this.city = buffer.toString();
			this.state = "telanagan";
			this.country = "India";

			
		
	}

}
