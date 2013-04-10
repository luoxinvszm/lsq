package org.lsq.action;

import com.opensymphony.xwork2.ActionSupport;

public class MessageSettingsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute() {
		System.out.println("MessageSettings Action ……");
		return "hello";

	}
}
