package com.cert;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.X509Certificate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ClientCertServlet")
public class ClientCertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ClientCertServlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		X509Certificate[] certs=(X509Certificate[]) request.getAttribute("jakarta.servlet.X509Cerificate");
		PrintWriter out=response.getWriter();
		out.println("<h1>Client Certifiaction Model of Security</h1>");
		if(certs!=null) {
			out.println("<h3>Subject:</h3>"+certs[0].getSubjectDN().getName());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
