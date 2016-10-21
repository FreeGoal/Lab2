package com.lining.struts2;

import java.sql.*;
import java.util.ArrayList;

import com.lining.struts2.author;
public class authoraction {
	private ArrayList<author> authors = new ArrayList<author>();
	private Connection conn = null;
	
	private String nauthorid;
	private String nname;
	private String nage;
	private String ncountry;
	
	private void connect() {
		try {
			String URL = "jdbc:mysql://localhost:3306/BookDB";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "1234");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void disconnect() {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}

	public String create() {
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into author values("+nauthorid+",'"+nname+"',"+nage+",'"+ncountry+"')";
			int result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		disconnect();
		return "success";
	}
	
	public ArrayList<author> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<author> authors) {
		this.authors = authors;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public String getNage() {
		return nage;
	}

	public void setNage(String nage) {
		this.nage = nage;
	}

	public String getNcountry() {
		return ncountry;
	}

	public void setNcountry(String ncountry) {
		this.ncountry = ncountry;
	}

	public String getNauthorid() {
		return nauthorid;
	}

	public void setNauthorid(String nauthorid) {
		this.nauthorid = nauthorid;
	}
}
