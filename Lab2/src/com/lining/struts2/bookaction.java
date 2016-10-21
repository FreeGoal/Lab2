package com.lining.struts2;

import java.sql.*;
import java.util.ArrayList;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.convention.annotation.Result;
import com.lining.struts2.book;

public class bookaction {
	private ArrayList<book> books = new ArrayList<book>();
	private Connection conn = null;
	private String qisbn;
	private String qauthorid;

	private String nisbn;
	private String ntitle;
	private String nauthorid;
	private String npublisher;
	private String npublishdata;
	private String nprice;

	private String mtitle;
	
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

	private void query(String sql) {
		connect();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				books.add(new book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6)));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		disconnect();
	}
	
	public String queryall() {
		query("SELECT * FROM book");
		return "success";
	}

	public String queryisbn() {
		query("SELECT * FROM book where isbn = " + qisbn);
		return "success";
	}

	public String queryauthor() {
		return "SELECT * FROM book where Author_ID = " + qauthorid;
	}
	
	private String check(){
		String temp = "success";
		connect();
		try{
			Statement stmt = conn.createStatement();
			String sql = "select * from author where Author_ID="+nauthorid;
			ResultSet res = stmt.executeQuery(sql);
			if(!res.next()){temp = "error";}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		disconnect();
		return temp;
	}
	public String create() {
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into book values("+nauthorid+",'"+ntitle+"','"+npublisher+"','"+npublishdata+"',"+nprice+",'"+nisbn+"')";
			int result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		disconnect();
		return check();
	}
	
	public String dele() {
		connect();
		try {
			Statement stmt = conn.createStatement();
			String sql = "delete from book where isbn='"+qisbn+"'";
			int result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		disconnect();	
		return "success";
	}
	
	public String modify(){
		query("SELECT * FROM book where isbn = " + qisbn);
		String origid=books.get(0).getPublishdata();///?
		setNauthorid(books.get(0).getAuthorid());
		setNisbn(books.get(0).getIsbn());
		setNtitle(books.get(0).getTitle());
		setNpublisher(books.get(0).getPublisher());
		setNpublishdata(books.get(0).getPublishdata());
		setNprice(books.get(0).getPrice());
		dele();
		return "success";
	}
	
	public ArrayList<book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<book> books) {
		this.books = books;
	}

	public String getQauthorid() {
		return qauthorid;
	}

	public void setQauthorid(String qauthorid) {
		this.qauthorid = qauthorid;
	}

	public String getQisbn() {
		return qisbn;
	}

	public void setQisbn(String qisbn) {
		this.qisbn = qisbn;
	}

	public String getNisbn() {
		return nisbn;
	}

	public void setNisbn(String nisbn) {
		this.nisbn = nisbn;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNauthorid() {
		return nauthorid;
	}

	public void setNauthorid(String nauthorid) {
		this.nauthorid = nauthorid;
	}

	public String getNpublisher() {
		return npublisher;
	}

	public void setNpublisher(String npublisher) {
		this.npublisher = npublisher;
	}

	public String getNpublishdata() {
		return npublishdata;
	}

	public void setNpublishdata(String npublishdata) {
		this.npublishdata = npublishdata;
	}

	public String getNprice() {
		return nprice;
	}

	public void setNprice(String nprice) {
		this.nprice = nprice;
	}

	public String getMtitle() {
		return mtitle;
	}

	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}

}
