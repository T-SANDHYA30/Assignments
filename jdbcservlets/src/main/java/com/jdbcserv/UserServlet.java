package com.jdbcserv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserServlet() {
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		ServletContext context = getServletContext();
        String url = context.getInitParameter("URL");
        String user = context.getInitParameter("User");
        String password = context.getInitParameter("Password");
		
		PrintWriter out = response.getWriter();
		
		String CourseID=request.getParameter("CourseID");
		String CourseName=request.getParameter("CourseName");
		String Faculty=request.getParameter("Faculty");

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			 String sql = "insert into CourseDetails(CourseID, CourseName,Faculty) values(?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, CourseID);
            ps.setString(2, CourseName);
            ps.setString(3, Faculty);
            int rows=ps.executeUpdate();
            if(rows>0)
            	System.out.println("inserted successfully");
            else
            	System.out.println("Insertion failed!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		out.println("CourseID"+CourseID+"<br><br>");
		out.println("CourseName"+CourseName+"<br><br>");
		out.println("Faculty"+Faculty+"<br><br>");
		out.close();
	}
	

      
}
