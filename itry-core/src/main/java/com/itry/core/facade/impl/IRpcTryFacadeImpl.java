package com.itry.core.facade.impl;

import com.itry.facade.IRpcTryFacade;
import com.itry.facade.domain.MessageBean;

/**
 * @author Jack Chan
 * @date 2019/6/21
 */
public class IRpcTryFacadeImpl implements IRpcTryFacade {

	@Override
	public String getMessage(MessageBean bean) {
		return "In Core Rpc Service : \n" + bean.toString();
	}

}
