package org.lsq.action;

import org.lsq.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteUsersAction extends ActionSupport{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String userId;
	private IUserService userService;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


	
	
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}


	public String execute(){
		System.out.println(userId+"---");
		userService.deleteUser(userId);
		System.out.println("success");
		return SUCCESS;
	}
}
