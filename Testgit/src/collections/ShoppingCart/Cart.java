package collections.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	public List<Product> cartItems = new ArrayList<>();
	
	private Product getProductByProductId(int pid) {
		Product product = null;

		List<Product> products = new Products().getProducts();

		for (Product product2 : products) {

			if (product2.getPid() == pid) {
				product = product2;

				break;
			}

		}

		return product;

	}

	public void addProductByProductId(int pid) {
		Product product = getProductByProductId(pid);
		System.out.println(cartItems.add(product));
	}

	public void removeProductByProductId(int pid) {
		Product product = getProductByProductId(pid);
		System.out.println(cartItems.remove(product));
	}
	
	public void printCartItems()
	{
		for (Product product : cartItems) {
			System.out.println(product.getName());
		}
	}

}
