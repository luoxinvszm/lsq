package org.lsq.messagelistening;

import org.lsq.service.impl.LsqClientService;
import org.lsq.service.impl.MessageReciverService;
import org.springframework.beans.factory.InitializingBean;
/**
 * 类名：ComListening
 * 功能：建立接收信息的线程，服务器启动后自动加载ComListening类
 *      并且执行afterPropertiesSet()方法;
 * 
 * */
public class MessageListening implements InitializingBean{
	private MessageReciverService messageReciverService;
	private LsqClientService lsqClientService;
	
	public void afterPropertiesSet() throws Exception {
		messageReciverService.start();
		lsqClientService.start();
	}

	public void setMessageReciverService(MessageReciverService messageReciverService) {
		this.messageReciverService = messageReciverService;
	}

	public void setLsqClientService(LsqClientService lsqClientService) {
		this.lsqClientService = lsqClientService;
	}
	
}
