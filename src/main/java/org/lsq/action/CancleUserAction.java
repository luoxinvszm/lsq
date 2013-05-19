package org.lsq.action;

import org.lsq.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

public class CancleUserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IUserService userService;
	private String username;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
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
		System.out.println(username);
		System.out.println(status+"---");
		if("0".equals(status)){
			System.out.println(0);
			userService.cancelUsers(username);
		}else if("1".equals(status)){
			System.out.println(1);
			userService.recoverUsers(username);
		}
		return SUCCESS;
	}
}
