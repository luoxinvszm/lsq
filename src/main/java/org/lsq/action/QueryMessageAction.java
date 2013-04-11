package org.lsq.action;

import java.util.List;

import org.lsq.service.IQureyMessageService;
import org.lsq.vo.Message;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QueryMessageAction extends ActionSupport {
	// 接口的注入
	private IQureyMessageService qureyMessageService;

	public void setQureyMessageService(IQureyMessageService qureyMessageService) {
		this.qureyMessageService = qureyMessageService;
	}

	// 前台传入的信息
	/*private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}*/
	

	// 集合的注入
	private List<Message> messageList;

	

	public List<Message> getMessageList() {
		return messageList;
	}

	// 主方法
	public String execute() {

		System.out.println("qureymessageaction starting····" );

		messageList = qureyMessageService.checkQuery("123","",0);
		for (Message m : messageList) {
			System.out.println(m.getMsgId());
			System.out.println(m.getMsgTypeId());
			System.out.println(m.getPublisherName());
			System.out.println(m.getPublisherPhone());
			System.out.println(m.getMsgRemark());
			System.out.println(m.getPublishTime());
			System.out.println(m.getMsgConctent());
			System.out.println(m.getMsgStatus());
			System.out.println("***************************************");
		}
		return SUCCESS;

	}
}
