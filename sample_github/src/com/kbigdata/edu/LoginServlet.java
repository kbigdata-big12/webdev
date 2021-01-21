package com.kbigdata.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String result = "";
		if(id.equals("hong") && pw.equals("1234")) {
			result = "get 정상 로그인";
		}else {
			result = "get 아이디나 비밀번호가 틀렸습니다.";
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter client = response.getWriter();
		client.println(result);
		client.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String result = "";
		if(id.equals("hong")) {
			result = "post 정상 아이디";
		}else {
			result = "post 아이디 오류";
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter client = response.getWriter();
		client.println(result);
		client.close();
	}

}
