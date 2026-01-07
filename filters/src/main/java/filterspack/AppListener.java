package filterspack;

import java.io.IOException;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AppListener")
public class AppListener implements ServletContextListener {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AppListener() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	ServletContextListener.super.contextInitialized(sce);
    	System.out.println("App initialized");
    }
    
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    	ServletContextListener.super.contextDestroyed(sce);
    	System.out.println("App Destroyed");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
