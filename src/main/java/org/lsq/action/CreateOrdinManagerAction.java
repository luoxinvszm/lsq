package org.lsq.action;



import org.lsq.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;
public class CreateOrdinManagerAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 创建普通管理员的action
	 * */
	public IUserService userService;
	public String username;
	public String password;
	public String roleId;
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
