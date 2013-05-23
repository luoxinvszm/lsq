package org.lsq.action;




import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.lsq.service.IRoleCastPowerService;
import org.lsq.service.IUserService;
import org.lsq.vo.Power;
import org.lsq.vo.User;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author ylg yhy
 * 管理员登录Action
 */

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private IUserService userService;
	
	private IRoleCastPowerService roleCastPowerService;
	
	private List<Power> powersList;
	
	public void setRoleCastPowerService(IRoleCastPowerService roleCastPowerService) {
		this.roleCastPowerService = roleCastPowerService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
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
			System.out.println(auth+"auth-----");
			HttpSession session =ServletActionContext.getRequest().getSession();
			String s = session.getAttribute("rand").toString();
			System.out.println(s+"-----------");
			if(session.getAttribute("username")==null && auth.compareToIgnoreCase(s)!=0){
				this.addFieldError("auth", "验证码输入错误!");
			}
			if(session.getAttribute("username")==null && userService.isLogin(username, password)==-1){
				this.addFieldError("user", "用户名或密码错误");
			}
		}
	//execute方法
	public String execute(){
		if(hasFieldErrors()){
			return INPUT;
		}else{
				int roleId=userService.isLogin(username, password);
				long userId=userService.getuserId(username, password);
				User user1 =userService.queryUser(username, password);
				System.out.println(userId+"---------");
				System.out.println(user1.getUserRealName()+"====");
				HttpSession session=ServletActionContext.getRequest().getSession();
				//如果用户成功登陆，则将用户信息添加到session中
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				session.setAttribute("roleId", roleId);
				session.setAttribute("userId", userId);
				session.setAttribute("userRealName", user1.getUserRealName());
				powersList=roleCastPowerService.queryPowers(roleId);
				return SUCCESS;
			}
	}
	
}
