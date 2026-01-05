package com.async;
//
//import java.io.IOException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//import jakarta.servlet.AsyncContext;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//
//@WebServlet(urlPatterns="/AsyncFile", asyncSupported=true)
//public class AsyncFile extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//	private static final ExecutorService executor=Executors.newFixedThreadPool(3);
//    public AsyncFile() {
//        // TODO Auto-generated constructor stub
//    }
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//doGet(request, response);
//		
//		AsyncContext ac=request.startAsync();
//		HttpServletRequest req = (HttpServletRequest) ac.getRequest();
//		HttpServletResponse resp = (HttpServletResponse) ac.getResponse();
//		executor.submit(()->{
//			try {
//				Thread.sleep(2000);
//				String inpStr=request.getParameter("inpStr");
//				if(inpStr==null)
//					response.getWriter().println("Please enter the TEXT");
//					else
//						inpStr = new StringBuilder(inpStr.toUpperCase()).reverse().toString();
//						response.getWriter().println("converted case successfully and reversed the string");
//				
//			} catch (InterruptedException | IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				finally {
//					ac.complete();
//				}
//			});
//		}
//
//}
 
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet(urlPatterns = "/AsyncFile", asyncSupported = true)
public class AsyncFile extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final ExecutorService executor = Executors.newFixedThreadPool(1);
    
    // TODO Auto-generated constructor stub
    public AsyncFile() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type for the response
        response.setContentType("text/plain");
 
        // Set up the AsyncContext
        final AsyncContext ac = request.startAsync();
        ac.setTimeout(60000); // Set a timeout (e.g., 60 seconds)
        
        // ************************************************************
        // ********************* CORE CORRECTIONS *********************
        // ************************************************************
 
        // 1. Get the request object and read the parameter *before* starting the async thread
        HttpServletRequest acRequest = (HttpServletRequest) ac.getRequest();
        final String inputStr = acRequest.getParameter("inpStr"); 
        
        // 2. Start the asynchronous execution
        executor.execute(
            () -> {
                try {
                    // 3. Get the response object from the context inside the thread
                    HttpServletResponse acResponse = (HttpServletResponse) ac.getResponse();
 
                    // Check if the parameter was successfully read
                    if (inputStr != null && !inputStr.trim().isEmpty()) {
                        
                        // Process the string: convert to uppercase and reverse
                        String result = new StringBuilder(inputStr.toUpperCase())
                                            .reverse()
                                            .toString();
 
                        // Write the result back to the response
                        acResponse.getWriter().println(result);
                        acResponse.getWriter().println("converted case successfully and reversed the string");
                        
                    } else {
                        acResponse.getWriter().println("ERROR: Please enter the TEXT!");
                    }
 
                } catch (IllegalStateException | IOException e) {
                    // This block handles errors during the async task
                    System.err.println("Async exception caught: " + e.getMessage());
                    // TODD Auto-generated catch block
                    // e.printStackTrace(); 
                } finally {
                    // 4. Complete the asynchronous cycle
                    ac.complete();
                }
            }
        );
    }
}

 