<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<%@ page import="java.net.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.fasterxml.jackson.databind.*"%>

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
	String token = request.getParameter("token");
	String sql = "SELECT email FROM users WHERE email='"+email+"'";
	ResultSet rs = stmt.executeQuery(sql);
	if(rs.next()) {
		System.out.println(email);
		
		if(rs.getString("email").equals(email)) {
			out.println("이미 존재하는 email.");
		}
	} 
	
	sql = String.format("INSERT INTO %s VALUES ('%s', '%s', '%s', 's')", 
			"users", email, name, password, token);
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

<%
String email = request.getParameter("email");
String content = request.getParameter("content");
System.out.println(email+"?");
System.out.println(content+"?");
String json = 
String.format("{\"to\":\"%s\",\"data\":{\"email\":\"%s\",\"content\":\"%s\"}}", 
		"fgIliu8qwi0:APA91bGsXczsNkA2ggy2RiUkiR9vjPASKyB5X5tCH0_G5n4kvxyq0nX1kIVFY7Enfnz_Jj1o_DG5mdGreYFlEhPO0Hs43CbYGjFhUaf6gq9J0_rhSPln93-0eDW32_MyoiHn8hOlCSXj",
		email,
		content);

String messageMap = sendREST("https://fcm.googleapis.com/fcm/send", json);
%>



<%!

public static String sendREST(String sendUrl, String jsonValue) throws IllegalStateException {

String inputLine = null;
StringBuffer outResult = new StringBuffer();

  try{
	URL url = new URL(sendUrl);
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	conn.setDoOutput(true);
	conn.setRequestMethod("POST");
	conn.setRequestProperty("Content-Type", "application/json");
	conn.setRequestProperty("Authorization", "key=AAAAlNLyOZQ:APA91bF5XEYeS_O5yog35zQmXhxa77YVxYGtL8Lv7QX956G-JEpsxyaSmtBj5C12wIM9tb0utbE0CEZ12r2y5NhjHpf6U3LPOYiaAz1DM9b_nZ3DLu5oQVZggiHyYTaz1kz-jbQSnI09"); 
	conn.setConnectTimeout(10000);
	conn.setReadTimeout(10000);
      
	OutputStream os = conn.getOutputStream();
	os.write(jsonValue.getBytes("UTF-8"));
	os.flush();
    
	// 리턴된 결과 읽기
	BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
	while ((inputLine = br.readLine()) != null) {
		outResult.append(inputLine);
	}
    
	conn.disconnect();
  }catch(Exception e){
      e.printStackTrace();
  }	
  
  return outResult.toString();
}
%>