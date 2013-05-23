package org.lsq.action;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	private String userRealName;
	private String sname;
	private String RealName;
	
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
		username=userService.createUsername();
		password="111111";
		roleId="2";
		byte[] temp;
		try {
			temp = RealName.getBytes("iso-8859-1");
			String name = new String(temp,"utf-8");
			sname=name;
			String time =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			System.out.println(sname+"========");
			if(userService.isAddUser(username, password, roleId,name,time)){
				System.out.println("success");
				return SUCCESS;
			}
			
			return INPUT;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return INPUT;
	}

}
