package org.lsq.action;

import java.util.List;

import org.lsq.service.IUserService;
import org.lsq.vo.User;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 编辑管理员
 * @author yhy
 * 
 */
public class EditOrdinAdminAction extends ActionSupport{

	private int roleId;
	private int userId;
	
	private int userStatus;
	
	private static final long serialVersionUID = 1L;
	
	private IUserService userService;
	
	private List<User> usersList;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
	
	public List<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public String deleteUser(){
		userService.cancelUser(userId);
		setUserStatus(0);
		return execute();
	}
	
	public String recoverUser(){
		userService.recoverUser(userId);
		setUserStatus(1);
		return execute();
	}

	//execute方法
	public String execute(){
		//调用UserService中的方法，查询普通管理员的信息
		usersList=userService.queryUsersByRoleId(2,userStatus);
		//如果管理员状态为可用，则注销管理员，
		if(userStatus==0){
			return "delete";
		}
		//如果管理员的状态不可用，则恢复管理员
		else if(userStatus==1){
			return "recover";
		}
		return SUCCESS;
	}

}
