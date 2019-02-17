package colletion.HashMapDemo;

public class Account implements Comparable<Account> { /*implemented for Tree map*/

	private Integer accNo;
	private String name;
	private double bal;

	public Account()
	{
		
	}
	
	public Account(Integer accNo, String name, double bal) {
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "accNo=" + accNo + ", name=" + name + ", bal=" + bal +" ";
	}
	
	/*below 2 overrides methods for Hashset*/

	@Override
	public int hashCode() {
		return this.getAccNo();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accNo == null) {
			if (other.accNo != null)
				return false;
		} else if (!accNo.equals(other.accNo))
			return false;
		return true;
	}
	
	/*This override method for Tree map*/

	@Override
	public int compareTo(Account o) {
		
		return this.getAccNo().compareTo(o.getAccNo());
	}
	
	
	
	
	

}
