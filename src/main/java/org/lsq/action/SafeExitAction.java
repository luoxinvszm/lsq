package org.lsq.action;



import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class SafeExitAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("username", null);
		session.setAttribute("password", null);
		session.setAttribute("roleId", null);
		session.setAttribute("userId", null);
		session.setAttribute("userRealName", null);
		session.setAttribute("rand", null);
		return SUCCESS;
	}
}
