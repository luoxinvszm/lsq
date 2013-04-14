package org.lsq.action;

import org.lsq.service.IMessageSettingsService;

import com.opensymphony.xwork2.ActionSupport;

public class MessageSettingsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IMessageSettingsService messageSettingsService;
	private String method;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public IMessageSettingsService getMessageSettingsService() {
		return messageSettingsService;
	}

	public void setMessageSettingsService(
			IMessageSettingsService messageSettingsService) {
		this.messageSettingsService = messageSettingsService;
	}

	public String InsertMessageSettings() {
		System.out.println("……");
		System.out.println(method);
		return INPUT;
	}

	public String execute() {
		System.out.println("MessageSettings Action ……");
		System.out.println(method);
		//messageSettingsService.InsertMessageSettings("SendMsgNum", 2);
		return INPUT;

	}

}
