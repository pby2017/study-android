<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
String driverName = "com.mysql.cj.jdbc.Driver";
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

if(request.getParameter("signin") != null){
	String email = request.getParameter("email");
	String password = request.getParameter("password");
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
} else if (request.getParameter("signup") != null){
	System.out.println("this is signup");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String sql = "SELECT email FROM users WHERE email='"+email+"'";
	ResultSet rs = stmt.executeQuery(sql);
	if(rs.next()) {
		System.out.println(email);
		
		if(rs.getString("email").equals(email)) {
			out.println("이미 존재하는 email.");
		}
	} 
	
	sql = String.format("INSERT INTO %s VALUES ('%s', '%s', '%s')", 
			"users", email, name, password);
	try{
		int result = stmt.executeUpdate(sql);

		if (result == 1) {
			out.println("회원 가입 성공");
		} else {
			out.println("회원 가입 실패");
		}		
	} catch(Exception e) {
		out.println(e.toString());
	}
}

stmt.close();
conn.close();
%>