<%@page import="edu.ict.prj.vo.EmpVO"%>
<%@page import="edu.ict.prj.dao.DeptDao"%>
<%@page import="edu.ict.prj.vo.DeptVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Emp EL</h1>
	<%
		EmpVO emp = new EmpVO();
		emp.setEmpno(1000);
		emp.setEname("홍길동");
	
		pageContext.setAttribute("emp",emp);
	%>
	${emp.getEname()}<br>
	${emp.ename}<br> <!-- ename은 프라빗이라 다이렉트로 부르는게 아니라 getEname으로 바껴서 호출 -->

</body>
</html>