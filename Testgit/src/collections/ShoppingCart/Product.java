package collections.ShoppingCart;

import java.util.Objects;

public class Product {

	private Integer pid;
	private String name;
	private Double price;
	private Integer stock;

	public Product(Integer pid, String name, Double price, Integer stock) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}

	@Override
	public int hashCode() {
		
		return pid;
	}

	@Override
	public boolean equals(Object obj) {
		   if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Product other = (Product) obj;
	        if (!Objects.equals(this.name, other.name)) {
	            return false;
	        }
	        if (!Objects.equals(this.pid, other.pid)) {
	            return false;
	        }
	        if (!Objects.equals(this.price, other.price)) {
	            return false;
	        }
	        if (!Objects.equals(this.stock, other.stock)) {
	            return false;
	        }
	        return true;
	}
	
	

}
