<%@page import="edu.ict.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>bean 예제입니다</h1>
	<%
		//Student student1 =new Student();
	    //         student1.SetName("홍길동")
	    
	 
	%>
	<jsp:useBean id="student" class="edu.ict.bean.Student"/>
	
	<jsp:setProperty property="name" name="student" value="홍길동"/>
	<jsp:setProperty property="age" name="student" value="17"/>
	<jsp:setProperty property="grade" name="student" value="6"/>
	<jsp:setProperty property="studentNum" name="student" value="7000"/>
				
	이름: <jsp:getProperty property="name" name="student"/> <br>
	나이: <jsp:getProperty property="age" name="student"/> <br>
	학년: <jsp:getProperty property="grade" name="student"/> <br>
	학번: <jsp:getProperty property="studentNum" name="student"/> <br>
</body>
</html>