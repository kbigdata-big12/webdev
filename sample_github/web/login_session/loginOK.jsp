<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals("abcde") && pw.equals("12345")){
		session.setAttribute("id", id);
		response.sendRedirect("welcome.jsp");
	}else{
		response.sendRedirect("loginForm.jsp");
	}

%>