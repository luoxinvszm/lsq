package org.lsq.action;

import org.lsq.service.IUserService;


import com.opensymphony.xwork2.ActionSupport;
/**
 * 创建普通管理员的action
 * */
public class CreateOrdinManagerAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;

	private IUserService userService;
	private String username;
	private String password;
	
	private String roleId;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	//execute方法()
	public String execute(){
		username=userService.createUsername();
		password="111111";
		roleId="2";
		System.out.println(username);
		if(userService.isAddUser(username, password, roleId)){
			return SUCCESS;
		}
		
		return INPUT;
	}

}
