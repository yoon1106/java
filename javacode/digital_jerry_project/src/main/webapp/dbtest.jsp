<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection conn = null;
		try{
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "digital_jerry";
			String password = "jerry";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // url, user, password�� ������ ó���ص���
			out.print("�����ͺ��̽� ������ �����߽��ϴ�.");
		} catch(SQLException ex) {
			out.print("�����ͺ��̽� ������ �����߽��ϴ�.");
			out.print("SQLException : " + ex.getMessage());
		}finally{
			if(conn != null) {
				conn.close();
			}
		}
	%>
</body>
</html>