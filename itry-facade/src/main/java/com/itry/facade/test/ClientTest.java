/**
 * 
 */
package com.itry.facade.test;

import com.itry.facade.IRpcTryFacade;
import com.itry.facade.domain.MessageBean;
import com.itry.facade.rpc.RpcFramework;

/**
 * RpcConsumer  测试
 * 这里假设在其他项目中调用rpc接口
 * 
 * @author Jack Chan
 * @date 2019/6/21
 */
public class ClientTest {

	public static void main(String[] args) {
		try {
			IRpcTryFacade service = RpcFramework.refer(IRpcTryFacade.class, "127.0.0.1", 1234);
			String result = service.getMessage(new MessageBean("01", "rpc", "JackChan is a very very very good boy."));
			System.err.println("客户端收到远程调用的结果 ：\n " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
