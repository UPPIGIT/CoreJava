package collections.ShoppingCart;

import java.util.List;
import java.util.Scanner;

public class UI {

	private int ch;

	Cart cart = new Cart();

	public void startScreen() {
		System.out.println("1. Display Store Products");
		System.out.println("2. Display cart Items");
		System.out.println("0. Exit");
	}

	public UI() {
		menu();
	}

	private int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		ch = scanner.nextInt();
		return ch;
	}

	private void displayStoreProducts() {
		List<Product> products = new Products().getProducts();

		for (Product product : products) {
			System.out.println("PID : " + product.getPid()+" " + "Product Name : " + product.getName()+" "  + "Price : "
					+ product.getPrice() +" " + "stock : " + product.getStock());
		}
	}

	private void storeProductsMenu() {
		System.out.println("1. Add to cart");
		System.out.println("2. Remove from cart");
		System.out.println("0. Exit");
	}

	private void innerChoice1() {
		switch (ch) {
		case 1:
			addProductToCart();
			showCart();
			break;

		case 2:
			removeFromCart();
			showCart();
			break;
		case 0:
			System.out.println("Thanks you...");
			System.exit(0);
			break;

		default:
			System.out.println("Invalid entry");
			menu();
			break;
		}
	}

	private void addProductToCart() {
		System.out.println("please add product id from above list");
		int pid = getUserInput();
		cart.addProductByProductId(pid);
		System.out.println("added to cart successfully..no of of products in cart is : "+cart.cartItems.size());

	}

	private void showCart() {
		System.out.println("products in your cart "+cart.cartItems);
		cart.printCartItems();
	}

	private void removeFromCart() {
		System.out.println("please add product id which do u want remove :");
		int pid = getUserInput();
		cart.removeProductByProductId(pid);
		System.out.println("Removed from cart .. no of products in your cart:" +cart.cartItems.size());
	}

	public void menu() {

		do {

			startScreen();
			getUserInput();

			switch (ch) {
			case 1:
				displayStoreProducts();
				storeProductsMenu();
				getUserInput();
				innerChoice1();

				break;

			case 2:
				showCart();
				break;
			case 0:
				System.out.println("Thank you");
				System.exit(0);

				break;
			default:
				System.out.println("invalid entry ");
				innerChoice1();
				break;
			}

		} while (ch != 0);
	}

}
