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
	conn.setRequestProperty("Authorization", "key=REDACTED_FCM_SERVER_KEY"); 
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