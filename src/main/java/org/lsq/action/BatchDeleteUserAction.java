package org.lsq.action;

import java.util.List;

import org.lsq.service.IUserService;
import org.lsq.vo.User;

import com.opensymphony.xwork2.ActionSupport;

public class BatchDeleteUserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IUserService userService;
	private String userIds;
	private List<User> usersList;

	public List<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String getUserIds() {
		return userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String execute(){
		System.out.println(userIds+"-----------");
		String[] words=userIds.split(",");
		userService.batchDeleteUsers(words);
		usersList = userService.queryUsersByRoleId(0, 1);
		return SUCCESS;
	}
}
