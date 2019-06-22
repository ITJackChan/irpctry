package com.itry.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itry.core.dao.MessageDAO;
import com.itry.facade.domain.MessageBean;

/**
 * @author Jack Chan
 * @date 2019/6/21
 */
@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	MessageDAO messageDAO;
	
	@Override
	public String getMessage(MessageBean msg) {
		return messageDAO.getMessage(msg);
	}

}
