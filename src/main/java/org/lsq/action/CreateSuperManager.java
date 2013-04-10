package org.lsq.action;

import org.lsq.service.IAddUserService;
import org.lsq.util.NameUtil;

import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class CreateSuperManager extends ActionSupport{
	/**
	 * 创建超级管理员的action
	 * */
	public IAddUserService addUserService;
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
	public IAddUserService getAddUserService() {
		return addUserService;
	}
	public void setAddUserService(IAddUserService addUserService) {
		this.addUserService = addUserService;
	}
	public String execute(){
		username=new NameUtil().generateName();
		password="111111";
		roleId="1";
		if(addUserService.isAddUser(username, password, roleId)){
			return SUCCESS;
		}
		return SUCCESS;
	}
}
