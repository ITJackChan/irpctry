package com.itry.core.dao;

import java.util.Properties;

import org.springframework.stereotype.Component;

import com.itry.core.util.PropertiesUtil;
import com.itry.facade.domain.MessageBean;

/**
 * @author Jack Chan
 * @date 2019/6/21
 */
@Component
public class MessageDAOImpl implements MessageDAO{

	@Override
	public String getMessage(MessageBean msg) {
		Properties properties = PropertiesUtil.getProperties("welcome");
		String value = (String) properties.get("welcomekey");
		String result = value + ", World!";
		System.out.println("DAO: " + result);
		return result;
	}

}
