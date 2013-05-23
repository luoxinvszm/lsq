package org.lsq.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.lsq.service.IUserService;
import org.lsq.vo.User;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 创建普通管理员的action
 * */
public class CreateOrdinManagerAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;

	private IUserService userService;
	private String username;
	private String password;
	private String userRealName;
	private String sname;
	private String RealName;
	private List<User> list = new ArrayList<User>();
	
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public String getRealName() {
		return RealName;
	}
	public void setRealName(String realName) {
		RealName = realName;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
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
		System.out.println("创建管理员"+RealName);
		
		username=userService.createUsername();
		password="111111";
		roleId="2";
		String time =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		if(userService.isAddUser(username, password, roleId,RealName,time)){
				User user = new User();
				user = userService.queryUser(username, password);
				list.add(user);
				System.out.println("success");
				return SUCCESS;
	
		}
			return null;
	}
}
