package colletions.HashsetDemo;

public class Customer {

	private Integer customerId;
	private String customerName;

	public Customer(Integer customerId, String customerName) {

		this.customerId = customerId;
		this.customerName = customerName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return customerId + " : " + customerName;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer customer = (Customer)obj;
		return this.getCustomerId().equals(customer.getCustomerId());
	}
	
	@Override
	public int hashCode() {
		
		return this.getCustomerId();
	}

}
