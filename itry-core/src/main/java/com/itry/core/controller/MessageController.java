package com.itry.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itry.core.service.MessageService;
import com.itry.facade.domain.MessageBean;

/**
 * @author Jack Chan
 * @date 2019/6/21
 */
@RequestMapping("/")
@Controller
public class MessageController {
	
	@Autowired
	MessageService messageService;

	@RequestMapping("/index")
	@ResponseBody
	public String getMessage(MessageBean msg) {
		return messageService.getMessage(msg);
	};

}