package filterspack;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class LoggingFilter extends HttpFilter implements Filter {
	private static final Logger logger=LogManager.getLogger(LoggingFilter.class);
       

    public LoggingFilter() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
		logger.info("filter destroyed");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		logger.info("Incoming Request : {}{}from IP {}", req.getMethod(),req.getRequestURI(),req.getRemoteAddr());

		chain.doFilter(request, response);
		
		logger.info("Response sent for {}", req.getRequestURI());
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		logger.info("filter initialized");
	}

}
