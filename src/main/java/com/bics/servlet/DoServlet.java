package com.bics.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.bics.controller.SignUpController;
import com.bics.dto.SignUpDTO;
import com.bics.vo.SignUpVO;

@WebServlet("*.url")
public class DoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 6648033374289243546L;
	
	private static Logger logger=Logger.getLogger(DoServlet.class);
	
	SignUpController controller=new SignUpController();
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String urlAction=req.getParameter("urlAction");
		if(urlAction.equals("SignUp")) {
			logger.info("signUp link invoked");
			SignUpVO signVo=new SignUpVO();
			signVo.setFirstName(req.getParameter("first_name"));
			signVo.setLastName(req.getParameter("last_name"));
			signVo.setDob(req.getParameter("dob"));
			signVo.setContact(req.getParameter("contact"));
			signVo.setPassword(req.getParameter("password"));
			try {
				SignUpDTO signUpDto=controller.convertTosignUPDTO(signVo);
			} catch (Exception e) {
				logger.error(e.getMessage());
				e.printStackTrace();
			}
		}
		
		
	}
}
