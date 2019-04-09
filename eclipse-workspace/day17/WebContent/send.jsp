<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.net.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.fasterxml.jackson.databind.*"%>

<%

String json = 

"{\"to\":\"f9dB1HcKKIY:APA91bG-Pk1-HRU8i8wuLsCotd4qL3jypw_sFlgijh58ZdAPlQ6HGhJbTPWakDiadsQ2X1tameNxmrYqy2EFlpSVfOgvsvUdkmQbM7nON41wHpnP-acmmpX1Wh5zg728QThpSm3TfUuj\",\"notification\":{\"title\":\"Portugal vs. Denmark\",\"body\":\"great match!\"}}";

String msgMap = sendREST("https://fcm.googleapis.com/fcm/send", json);
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
	BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
	while ((inputLine = in.readLine()) != null) {
		outResult.append(inputLine);
	}
    
	conn.disconnect();
  }catch(Exception e){
      e.printStackTrace();
  }	
  
  return outResult.toString();
}
%>