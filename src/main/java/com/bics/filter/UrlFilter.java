package com.bics.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;

import org.apache.log4j.Logger;

@WebFilter("*.do")
public class UrlFilter implements Filter {
	
	private static Logger logger=Logger.getLogger(UrlFilter.class);

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		String fwdVal=null;
		RequestDispatcher rd=null;
		fwdVal=req.getParameter("btn");
		if(fwdVal.equals("Login")) {
			logger.debug("sent for login.jsp");
			rd=req.getRequestDispatcher("/WEB-INF/JSP/login.jsp");
			rd.forward(req, res);
		}
		else if(fwdVal.equals("SignUp")) {
			logger.debug("sent for sign_up.jsp");
			rd=req.getRequestDispatcher("/WEB-INF/JSP/sign_up.jsp");
			rd.forward(req, res);
		}
		else if(fwdVal.equals("Approve")) {
			logger.debug("sent for approve.jsp");
			rd=req.getRequestDispatcher("/WEB-INF/JSP/approval2.jsp");
			rd.forward(req, res);
		}

	}

}
