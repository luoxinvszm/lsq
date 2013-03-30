package org.lsq.action;

import org.lsq.service.ILoginService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private ILoginService loginService;
	
	
	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}
	
	private String username;
	private String password;
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
	public String execute(){
		System.out.println("action starting······");
		System.out.println("122121");
		if(loginService.isLogin(username, password)){
			return SUCCESS;
		}
		return INPUT;
		
	}
}
