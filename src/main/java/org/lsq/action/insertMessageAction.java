package org.lsq.action;

//import java.util.Calendar;

import org.lsq.service.IInsertMessageService;
import org.lsq.util.DateFormat;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class InsertMessageAction extends ActionSupport {

	private IInsertMessageService insertMessageService;

	public void setInsertMessageService(
			IInsertMessageService insertMessageService) {
		this.insertMessageService = insertMessageService;
	}

	private String messageContext;
	private String publisherName;
	private String publisherPhone;
	private String msgRemark;

	public String getMessageContext() {
		return messageContext;
	}

	public void setMessageContext(String messageContext) {
		this.messageContext = messageContext;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherPhone() {
		return publisherPhone;
	}

	public void setPublisherPhone(String publisherPhone) {
		this.publisherPhone = publisherPhone;
	}

	public String getMsgRemark() {
		return msgRemark;
	}

	public void setMsgRemark(String msgRemark) {
		this.msgRemark = msgRemark;
	}

	public String execute() {
		System.out.println("insertMessageAction starting······");
		
		String publishTime = DateFormat.dateToString();//获取系统当前时间

		if (insertMessageService.isInsertMessage(messageContext, publisherName,
				publisherPhone,publishTime, msgRemark) != 0) {
			return SUCCESS;
		}
		return INPUT;

	}

}
