package com.authentication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
//	    --------------------------------------------------------  using cookie	----------------------------------------------------
		
//		if(username.equals("sandhya")&&pwd.equals("renu"))
//		{
//			Cookie ck=new Cookie("user","username");
//			ck.setMaxAge(60*60);
//			response.addCookie(ck);
//			response.sendRedirect("Welcome.jsp");
//		}
//		else
//			response.sendRedirect("Error.jsp");
	
//  -----------------------------------------------------------using urlrewriting------------------------------------------------------
		
//	if(username.equals("sandhya")&&pwd.equals("renu"))
//		response.sendRedirect("Welcome.jsp?uname="+username);
//	else
//		response.sendRedirect("Error.jsp");
		
//		------------------------------------------------http method---------------------------------------------------------------------
		
		if(username.equals("sandhya")&&pwd.equals("renu")){
			HttpSession session=request.getSession();
			String token=UUID.randomUUID().toString();
			session.setAttribute("token", token);
			session.setAttribute("uname", username);
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
			rd.forward(request, response);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
