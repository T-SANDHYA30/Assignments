package com.config;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DBServlet")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public DBServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletConfig config=getServletConfig();
		PrintWriter out=response.getWriter();
		String url=config.getInitParameter("url");
		String uname=config.getInitParameter("uname");
		String pwd=config.getInitParameter("pwd");
		out.println("url: "+url);
		out.println("uname: "+uname);
		out.println("password: "+pwd);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
