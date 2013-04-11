package org.lsq.action;




import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.lsq.service.ILoginService;
import org.lsq.service.IRoleCastPowerService;
import org.lsq.vo.Power;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author ylg yhy
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
	//重新validate方法 进行数据校验
		public void validate(){
			System.out.println(auth);
			HttpSession session =ServletActionContext.getRequest().getSession();
			String s = session.getAttribute("rand").toString();
			System.out.println(s+"-----------");
			if(!auth.equals(s)){
				this.addFieldError("auth", "验证码输入错误!");
			}if(loginService.isLogin(username, password)==-1){
				this.addFieldError("user", "用户不存在!");
			}
		}
	//execute方法
	public String execute(){
		
		if(hasFieldErrors()){
			return INPUT;
		}else{
				int roleId=loginService.isLogin(username, password);
				HttpSession session=ServletActionContext.getRequest().getSession();
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				session.setAttribute("roleId", roleId);
				powersList=roleCastPowerService.queryPowers(roleId);
				System.out.println(powersList.size()+"----");
				return SUCCESS;
		
			}
		
	}
	
	
}
