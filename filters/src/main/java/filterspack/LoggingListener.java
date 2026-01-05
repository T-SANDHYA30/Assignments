package filterspack;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpServletRequest;

@WebListener
public class LoggingListener implements ServletRequestListener, ServletContextListener {

    /**
     * Default constructor. 
     */
    public LoggingListener() {
        // TODO Auto-generated constructor stub
    	
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	ServletContextListener.super.contextInitialized(sce);
    	System.out.println("log: App initialized at "+System.currentTimeMillis());
    }
    
    public void requestInitialized(ServletRequestEvent sre) {
    	ServletRequestListener.super.requestInitialized(sre);
    	HttpServletRequest req=(HttpServletRequest) sre.getServletRequest();
    	System.out.println("log: Request started ");
    	System.out.println("URI :"+req.getRequestURI());
    	System.out.println("Method : "+req.getMethod());
    	System.out.println("Time : " +System.currentTimeMillis());
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sre) {
    	ServletContextListener.super.contextDestroyed(sre);
    	System.out.println("log0: App Destroyed at "+System.currentTimeMillis());
    }
    
   

	
}
