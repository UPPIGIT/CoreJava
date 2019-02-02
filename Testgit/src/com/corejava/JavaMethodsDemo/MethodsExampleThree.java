package com.corejava.JavaMethodsDemo;

class Employee{
	
	int eid;
	String ename;
	String ecomp;
	
	

	public Employee() {
		this.eid=100;
		this.ename="UPPI";
		this.ecomp="CTS";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcomp() {
		return ecomp;
	}
	public void setEcomp(String ecomp) {
		this.ecomp = ecomp;
	}
	
	
}
public class MethodsExampleThree {
	
	Employee getEmpObj()
	{
		return new Employee();
	}

	public static void main(String[] args) {
		
		MethodsExampleThree obj= new MethodsExampleThree();
		
		Employee emp = obj.getEmpObj();
		
		System.out.println(emp.eid +"========="+emp.ename+"=========="+emp.ecomp);
		
		System.out.println(emp.getEcomp());
		System.out.println(emp.eid);
		System.out.println(emp.ename);
		
		

	}

}
