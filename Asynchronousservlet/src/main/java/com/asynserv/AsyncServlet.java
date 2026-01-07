package com.asynserv;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/AsyncServlet",asyncSupported=true)
public class AsyncServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	private static final ExecutorService executor=Executors.newSingleThreadExecutor();

    public AsyncServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	
		
		AsyncContext ac=request.startAsync();
		HttpServletRequest req = (HttpServletRequest) ac.getRequest();
		HttpServletResponse resp = (HttpServletResponse) ac.getResponse();
		executor.submit(()->{
			try {
				Thread.sleep(1000);
				String uname=request.getParameter("uname");
				String pwd=request.getParameter("pwd");
				if(uname.equals("sandhya")&& pwd.equals("moon"))
					response.getWriter().println("Authentication Successfull using Async");
					else
						response.getWriter().println("Invalid Credentials!!!");
				
			} catch (InterruptedException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				ac.complete();
			}
		});
	}

}
