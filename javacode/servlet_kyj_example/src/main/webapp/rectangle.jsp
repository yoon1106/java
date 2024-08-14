
<%@page import="eud.ict.shape.Rectangle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>


<%
  double width=Double.valueOf(request.getParameter("width"));
double height=Double.valueOf(request.getParameter("height"));
	Rectangle rectangle= new Rectangle(width,height);
%>
사각형 가로<%= width %><br>
사각형 세로<%= height %><br>
사각형의 넓이<%= rectangle.getArea() %>
</body>
</html>