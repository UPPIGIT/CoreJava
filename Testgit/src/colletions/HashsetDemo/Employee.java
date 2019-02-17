package colletions.HashsetDemo;

public class Employee implements Comparable<Employee> {
	
	private Integer empId;
	private String empName;
	private Double empSal;
	
	
	public Employee(Integer empId, String empName, Double empSal) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	
	@Override
	public int compareTo(Employee o) {
		
		
		return this.getEmpId().compareTo(o.getEmpId());
	}

	@Override
	public String toString() {
		return  empId + ", " + empName + ", " + empSal ;
	}

	

}
