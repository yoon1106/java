<%@page import="java.util.Arrays"%>
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
	int i = 10;
	String words = "ABCDE";

	public int sum(int a, int b) {
		return a + b;
	}%>

	<%
	out.print(i + "<br>");
	out.print(words + "<br>");
	out.print(sum(3, 5) + "<br>");
	%>

	<%=i %><br>
	<%=words  %><br>
	<%=sum(3, 5) %><br>
	<%
	int[]iArr={10,20,30};
	out.print(Arrays.toString(iArr)); //컨트롤+스페이스에서 맨위에뜨는거 임폴트 시키기 java.util.Arrays
    %>
	<%=iArr %><br>
	<%=Arrays.toString(iArr) %><br>
	<%="{10,20,30}" %><br>
	
	</body>
	</html>

	
	






