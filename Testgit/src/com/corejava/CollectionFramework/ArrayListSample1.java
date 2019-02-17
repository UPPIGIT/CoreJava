package com.corejava.CollectionFramework;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

class Employee {

	Integer empId;
	String name;
	Double Sal;
	String JoinDate;
	String Designation;
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public Employee(Integer empId, String name, Double sal, String designation) {

		this.empId = empId;
		this.name = name;
		Sal = sal;
		JoinDate =getCurrentTimeStamp();
		Designation = designation;
	}

	
	private static String getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return dateFormat.format(today.getTime());

	}
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return Sal;
	}

	public void setSal(Double sal) {
		Sal = sal;
	}

	public String getJoinDate() {
		return JoinDate;
	}

	public void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

}

public class ArrayListSample1 {

	static {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver loaded successfully..........");
		} catch (ClassNotFoundException e) {
			System.out.println("unable to load driver");
		}

	}

	public static Connection getDBConnection() {

		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe", "RISUSER_OWNER",
					"RISUSER_OWNER");
			System.out.println("Connection created successfully.........");
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return connection;

	}

	public static void main(String[] args) throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		dbConnection = getDBConnection();
		statement = dbConnection.createStatement();

		Employee employee = new Employee(1001, "Aadhya", (double) 800000, "softENg");
		

		String sqlquey = "Insert into EMPLOYEE_DB values(" + employee.getEmpId() + "," 
		+"'"+employee.getName() +"'"+ "," +"'"+employee.getDesignation()+"'" + ","+ employee.getSal() + "," +"to_date('"
		+ employee.getJoinDate()+ "', 'yyyy/mm/dd hh24:mi:ss'))"; 

		int i = statement.executeUpdate(sqlquey);

		System.out.println(i);

		dbConnection.close();
		statement.close();
	}

}
