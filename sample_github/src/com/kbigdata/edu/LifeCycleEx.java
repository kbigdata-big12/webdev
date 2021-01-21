package com.kbigdata.edu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycleEx")
public class LifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LifeCycleEx() {
        super();
        System.out.println("생성자 호출되었다.");
    }

    @Override
    public void init() throws ServletException {
//    	super.init();
    	System.out.println("init 호출되었다.");
    }
    
    @Override
    public void destroy() {
//    	super.destroy();
    	System.out.println("destory 호출되었다.");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출되었다.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출되었다.");
	}

}








