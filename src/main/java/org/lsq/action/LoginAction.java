package org.lsq.action;




import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.lsq.service.ILoginService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
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
		System.out.println(auth);
		//获取验证码的内容
		HttpSession session = ServletActionContext.getRequest().getSession();
		String s = session.getAttribute("authimg").toString();
		System.out.println(s+"---------");
		//判断验证码是否输入正确，如果错误 返回input
		if(!auth.equals(s)){
			this.addFieldError("auth", "验证码输入错误!");
			return INPUT;
		}else{
			if(loginService.isLogin(username, password)){
				return SUCCESS;
			}else if(!loginService.isLogin(username, password)){
				this.addFieldError("user", "用户不存在!");
				return INPUT;
			}
		}
		return INPUT;
		
	}
}
