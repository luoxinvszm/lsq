package org.lsq.action;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.lsq.service.ILoginService;
import org.lsq.service.IRoleCastPowerService;
import org.lsq.vo.Power;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 登录Action
 */

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private ILoginService loginService;
	
	private IRoleCastPowerService roleCastPowerService;
	
	private List<Power> powersList;
	
	public void setRoleCastPowerService(IRoleCastPowerService roleCastPowerService) {
		this.roleCastPowerService = roleCastPowerService;
	}
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
	public List<Power> getPowersList() {
		return powersList;
	}
	public void setPowersList(List<Power> powersList) {
		this.powersList = powersList;
	}
	
	//execute方法
	public String execute(){
		int roleId=loginService.isLogin(username, password);
	
			if(roleId!=-1){
				HttpSession session=ServletActionContext.getRequest().getSession();
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				session.setAttribute("roleId", roleId);
				powersList=roleCastPowerService.queryPowers(roleId);
				return SUCCESS;
			}else {
				this.addFieldError("user", "用户不存在!");
				return INPUT;
			}
		
	}
	
	
}
