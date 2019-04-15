<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<%
	String email = request.getParameter("email");
	String password = request.getParameter("password");

	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/android?characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Seoul";
	String id = "user";
	String pwd = "user";

	try {
		Class.forName(driverName);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		return;
	}
	
	Connection conn = DriverManager.getConnection(url, id, pwd);

	Statement stmt = conn.createStatement();

	String sql = "SELECT password FROM users WHERE email='"+email+"'";
	ResultSet rs = stmt.executeQuery(sql);
	if(rs.next()) {
		System.out.println(email);
		System.out.println(password);
		
		if(rs.getString("password").equals(password)) {
			out.println("로그인 성공");
		} else {
			out.println("로그인 실패");
		}
		
	} else {
		out.println("회원 가입부터 해주세요.");
	}

	stmt.close();
	conn.close();
%>