package com.corejava.CollectionFramework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

class Emp {

	public SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public String ename;
	public Integer eid;
	public Double sal;
	public String designation;
	public String joinDate;

	public Emp(String ename, Integer eid, Double sal, String designation, String joinDate) {

		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
		this.designation = designation;
		this.joinDate = joinDate;

	}

	@Override
	public String toString() {
		return "Emp [ ename=" + ename + ", eid=" + eid + ", sal=" + sal + ", designation=" + designation + ", joinDate="
				+ joinDate + "]";
	}

	public Emp() {

		String name = "adhyasruthiupendershreshtarishimani";
		Integer N = name.length();
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();

		for (int i = 0; i < 6; i++) {

			buffer.append(name.charAt(random.nextInt(N)));

		}

		this.ename = buffer.toString();
		this.eid = random.nextInt(10000);
		this.sal = random.nextInt(100) * 10000.00 + 1;
		this.designation = "SoftwareEng";
		this.joinDate = dateFormat.format(new Date().getTime());

		Emp emp = new Emp(ename, eid, sal, designation, joinDate);

		// System.out.println(this);

	}

	public static Emp getEmpObj() {
		return new Emp();
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

	public Timestamp getJoinDate() throws ParseException {
		return Timestamp.valueOf(this.joinDate);

	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

}

public class ArrayListSample2 {

	Emp[] emp;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully.......");
		} catch (ClassNotFoundException e) {
			System.out.println("unable to load driver" + e.getMessage());
		}
	}

	public static void main(String[] args) throws SQLException, ParseException {

		ArrayList<Emp> emps = new ArrayList<>();
		Connection connection = null;
		PreparedStatement statement = null;
		Emp[] emp;

		try {

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523", "RISUSER_OWNER",
					"RISUSER_OWNER");
			connection.setAutoCommit(false);
			statement = connection.prepareStatement("insert into EMPLOYEE_DB values(?,?,?,?,?)");

			System.out.println("connection created successfully....");

			for (int i = 0; i < 3; i++) {

				emps.add(new Emp());

			}

			Iterator<Emp> iterator = emps.iterator();

			while (iterator.hasNext()) {
				Emp emp2 = (Emp) iterator.next();

				statement.setInt(1, emp2.getEid());
				statement.setString(2, emp2.getEname());
				statement.setString(3, emp2.getDesignation());
				statement.setDouble(4, emp2.getSal());
				statement.setTimestamp(5, emp2.getJoinDate());

				statement.executeUpdate();
				System.out.println("inserted employee" + emp2);

			}

			connection.commit();

		} catch (SQLException e) {

			System.out.println("error while connecting database" + e.getMessage());
		} finally {
			connection.close();
			statement.close();

			System.out.println("connections closed");
		}

	}

}
