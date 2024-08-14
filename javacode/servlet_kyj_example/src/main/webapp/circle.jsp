<%@page import="eud.ict.shape.Circle"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<%!
double radius=0;
public double getArea(double radius){
 return	radius * radius * Math.PI;
}
%>
<%

 radius=Double.valueOf(request.getParameter("radius"));

%>
반지름<%=radius %><br>
원의 넓이<%=getArea(radius)%>
<hr>
<%
  double r=Double.valueOf(request.getParameter("radius"));
	Circle circle= new Circle(r);
%>
반지름<%= circle.getRadius() %><br>
원의 넓이<%= circle.getArea() %>
</body>
</html>