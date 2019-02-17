package com.corejava.CollectionFramework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class EmpDb {
	static ArrayList<EmpDb> arrayList = new ArrayList<>();
	public String ename;
	public Integer eid;
	public Double sal;
	public String designation;
	public String joinDate;

	@Override
	public String toString() {
		return "EmpDb [ename=" + ename + ", eid=" + eid + ", sal=" + sal + ", designation=" + designation
				+ ", joinDate=" + joinDate + "]" ;
	}

	public EmpDb(String ename, Integer eid, Double sal, String designation, String joinDate) {

		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
		this.designation = designation;
		this.joinDate = joinDate;
		
		
	}
	


	public static void addEmpList(EmpDb e) {
		arrayList.add(e);
		
		
	}
	
	public static List<EmpDb> getEmpList()
	{
		return arrayList;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

}

public class ArrayListSample3 {

	public static final String className = "oracle.jdbc.driver.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@localhost:1523:xe";
	public static final String user = "RISUSER_OWNER";
	public static final String pswd = "RISUSER_OWNER";
	 static EmpDb emp;

	static {
		try {
			Class.forName(className);
			System.out.println("Driver loaded successfully..");
		} catch (ClassNotFoundException e) {
			System.out.println("unable to load driver......" + e.getMessage());

		}
	}

	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		

		try {
			connection = DriverManager.getConnection(url, user, pswd);
			System.out.println("connection created successfully.....");
			statement = connection.createStatement();
			String sqlquery="select * from EMPLOYEE_DB";
		resultSet=statement.executeQuery(sqlquery);
		
		while(resultSet.next()) {
			
			String ename =resultSet.getString("EMP_NAME");
			Integer eid = resultSet.getInt("EMP_ID");
			String des =resultSet.getString("EMP_DESIGNATION");
			Double sal=resultSet.getDouble("EMP_SAL");
			Date joindate = resultSet.getDate("JOINING_DATE");
			
			emp = new EmpDb(ename, eid, sal, des, joindate.toString());
			EmpDb.addEmpList(emp);
			
			
		
		}
		System.out.println(EmpDb.getEmpList());
		System.out.println(EmpDb.getEmpList().size());
			
		} catch (SQLException ex) {
			System.out.println("unable to crate connaction.." + ex.getMessage());

		}
		
		finally {
			connection.close();
			statement.close();
			
		}

	}

}
