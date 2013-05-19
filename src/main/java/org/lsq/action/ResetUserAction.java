package org.lsq.action;

import org.lsq.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

public class ResetUserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IUserService userService;
	private String username;
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String execute(){
		System.out.println(username+"username");
		userService.resetPassword(username);
		return SUCCESS;
	}
	
}
