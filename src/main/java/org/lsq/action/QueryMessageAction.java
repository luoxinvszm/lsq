package org.lsq.action;

import java.util.ArrayList;
import java.util.List;

import org.lsq.service.IQureyMessageService;
import org.lsq.vo.Message;

import com.opensymphony.xwork2.ActionSupport;

public class QueryMessageAction extends ActionSupport {

	private static final long serialVersionUID = 7443363719737618408L;

	// 接口的注入
	private IQureyMessageService qureyMessageService;

	public void setQureyMessageService(IQureyMessageService qureyMessageService) {
		this.qureyMessageService = qureyMessageService;
	}

	// 前台传入的信息
	/*
	 * private String name;
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getName() { return name; }
	 */
	// *****************************************************************
	private String publisherPhone;
	private String publishTime;
	private int msgStatus;
	private String inMessage;
	public String getInMessage() {
		return inMessage;
	}

	public void setInMessage(String inMessage) {
		this.inMessage = inMessage;
	}

	public String getPublisherPhone() {
		return publisherPhone;
	}

	public void setPublisherPhone(String publisherPhone) {
		this.publisherPhone = publisherPhone;
	}

	public String getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public int getMsgStatus() {
		return msgStatus;
	}

	public void setMsgStatus(int msgStatus) {
		this.msgStatus = msgStatus;
	}

	// *****************************************************************

	// 集合的注入
	private List<Message> messageList;

	private List<String> msgContextList=null;
	
	public List<Message> getMessageList() {
		return messageList;
	}

	// 主方法
	public String execute() {
		System.out.println("qureymessageaction starting····");
		messageList = qureyMessageService.checkQuery(publisherPhone,
				publishTime, msgStatus);
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

	public String AutoMessages() {
		msgContextList=new ArrayList<String>();
		System.out.println("自动补全"+inMessage);
		messageList =qureyMessageService.qureyMessagesByLike(inMessage);
		
		for(Message m:messageList){
			msgContextList.add(m.getMsgConctent());
		}
		System.out.println("size="+msgContextList.size());
		return SUCCESS;
	}

	public List<String> getMsgContextList() {
		return msgContextList;
	}

	public void setMsgContextList(List<String> msgContextList) {
		this.msgContextList = msgContextList;
	}
	
	
	
}
