package org.lsq.commlistening;

import org.lsq.service.impl.MessageReciverService;
import org.springframework.beans.factory.InitializingBean;
/**
 * 类名：ComListening
 * 功能：建立一个监听串口发送数据的线程，服务器启动后自动加载ComListening类
 *      并且执行afterPropertiesSet()方法;
 * 
 * */
public class ComListening implements InitializingBean{
	private MessageReciverService messageReciverService;
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("加载串口监听...");
		messageReciverService.start();
	}

	public void setMessageReciverService(MessageReciverService messageReciverService) {
		this.messageReciverService = messageReciverService;
	}
}
