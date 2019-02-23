package com.bics.controller;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import com.bics.dao.SignUpDao;
import com.bics.dto.SignUpDTO;
import com.bics.vo.SignUpVO;

public class SignUpController {
	
	private static Logger logger=Logger.getLogger(SignUpController.class);
	
	public SignUpDTO convertTosignUPDTO(SignUpVO vo) throws Exception{
		SignUpDTO dto=new SignUpDTO();
		try {
			logger.info("Sign VO Data:"+vo.toString());
			BeanUtils.copyProperties(dto,vo);
			logger.info("Sign DTO Data:"+dto.toString());
		} catch (IllegalAccessException | InvocationTargetException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
		
		SignUpDao dao=new SignUpDao();
		dao.checkConnection();
		return dto;
	}
  
}
