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
	int age = Integer.parseInt(request.getParameter("age"));
	if (age >=20){
		response.sendRedirect("pass.jsp");
	}else{
		response.sendRedirect("ng.jsp");
	}
%>
</body>
</html>







