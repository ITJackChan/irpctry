package com.itry.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itry.core.facade.impl.IRpcTryFacadeImpl;
import com.itry.facade.IRpcTryFacade;
import com.itry.facade.rpc.RpcFramework;

/**
 * Hello world!
 * 
 * @author Jack Chan
 * @date 2019/6/21
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("http://localhost:8989/index");
		rpc();
	}

	/**
	 * rpc 服务提供，将服务暴露出来，供客户端消费
	 * RpcProvider
	 */
	public static void rpc() {
		IRpcTryFacade service = new IRpcTryFacadeImpl();
		try {
			RpcFramework.export(service, 1234);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
