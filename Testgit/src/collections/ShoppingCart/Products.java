package collections.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Products {

	private final List<Product> products = new ArrayList<>();
	
	public Products()
	{
		this.initStoreRoom();
	}

	public List<Product> getProducts() {
		return products;
	}
	
	public void initStoreRoom()
	{
		String[] productNames= {"lux","fiar n lovely","MTR"};
		Double[] prouctPrices= {25.00d,45.00d,60.00d};
		Integer[] stock = {10,15,20};
		this.products.add(new Product(1011, "luxu", 25.00d, 10));
		
		for (int i = 0; i < productNames.length; i++) {
			
			this.products.add(new Product(i+1011, productNames[i], prouctPrices[i], stock[i]));
			
		}
		
		
	}
	
}
