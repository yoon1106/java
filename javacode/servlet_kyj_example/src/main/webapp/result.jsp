<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>화폐 매수 결과</h1>
	<%
	int money = Integer.parseInt(request.getParameter("money"));
	int[] notes = { 50000, 10000, 5000, 1000, 500, 100 };
	int[] count = new int[notes.length];

	int cash = money;

	for (int i = 0; i < notes.length; i++) {
		count[i] = cash / notes[i];
		cash %= notes[i];
		
	}
	out.print("액수:"+money+"<br>");
	out.print("오만원:"+count[0]+"<br>");
	out.print("만원:"+count[1]+"<br>");
	out.print("오천원:"+count[2]+"<br>");
	out.print("천원:"+count[3]+"<br>");
	out.print("오백원:"+count[4]+"<br>");
	out.print("백원:"+count[5]+"<br>");
	%>
	

</body>
</html>