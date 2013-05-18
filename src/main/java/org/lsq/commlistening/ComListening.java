package org.lsq.commlistening;

import org.lsq.service.impl.MessageReciverService;
import org.springframework.beans.factory.InitializingBean;

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
