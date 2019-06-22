package com.itry.facade;

import com.itry.facade.domain.MessageBean;

/**
 * @author Jack Chan
 * @date 2019/6/21
 */
public interface IRpcTryFacade {

	public String getMessage(MessageBean msg);

}
