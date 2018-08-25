package info.telescopeworld.controllers;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

/**
 * A simple filter to output a log message for each REST query, including timing info.
 * 
 * @author amchavan, 06-Aug-2014
 */
@Component
public class RequestLoggingFilter implements Filter {

	protected StringBuilder msg = new StringBuilder();
	protected Logger logger = Logger.getLogger( this.getClass().getCanonicalName() );
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// no-op
	}

	@Override
	public void doFilter( ServletRequest request, 
						  ServletResponse response,
			              FilterChain chain ) throws IOException, ServletException {
		
		long before = new GregorianCalendar().getTimeInMillis();
		chain.doFilter(request, response);
		long after = new GregorianCalendar().getTimeInMillis();
		long duration = after - before;
		
		HttpServletRequest httpreq = (HttpServletRequest) request;
		
		msg.setLength( 0 );	// clear the message
		msg.append( httpreq.getRequestURI() )
		   .append( ", time: " )
		   .append( duration )
		   .append( "msec, from: " )
		   .append( httpreq.getRemoteAddr() )
		   .append( " (" )
		   .append( httpreq.getRemoteHost() )
		   .append( ")" );
		
		logger.info( msg.toString() );
	}

	@Override
	public void destroy() {
		// no-op
	}
}
