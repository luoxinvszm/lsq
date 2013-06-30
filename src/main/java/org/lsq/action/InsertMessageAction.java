package org.lsq.action;

//import java.util.Calendar;

import javax.servlet.http.HttpSession;


import org.apache.struts2.ServletActionContext;
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
	private int result;//i为0时前台则会跳转其他的界面
	private String auth;
	private String Json;

	

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public int getResult() {
		return result;
	}

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
	public void validate(){
		System.out.println(auth+"auth-----");
		HttpSession session =ServletActionContext.getRequest().getSession();
		String s = session.getAttribute("rand").toString();
		System.out.println(s+"-----------");
		if(auth.compareToIgnoreCase(s)!=0){
			this.addFieldError("auth", "验证码输入错误!");
		}
		
	}
	public String execute() {
		
			System.out.println("insertMessageAction starting······");
			String publishTime = DateFormat.dateToString();//获取系统当前时间
			if (insertMessageService.isInsertMessage(messageContext, publisherName,
					publisherPhone,publishTime, msgRemark) != 0) {
				result=0;
				return SUCCESS;
			}
				return INPUT;
			}
	
		
		

	}


