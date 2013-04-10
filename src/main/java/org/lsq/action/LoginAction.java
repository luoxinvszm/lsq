package org.lsq.action;



import org.lsq.service.ILoginService;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ILoginService loginService;
	
	
	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}
	private String auth;
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
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
			if(loginService.isLogin(username, password)){
				return SUCCESS;
			}else if(!loginService.isLogin(username, password)){
				this.addFieldError("user", "用户不存在!");
				return INPUT;
			}
		
		return SUCCESS;
		
	}
}
