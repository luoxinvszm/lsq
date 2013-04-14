package org.lsq.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.lsq.service.IUserService;
import org.lsq.vo.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	/**
	 * @author ylg
	 * 对用户进行操作
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private IUserService userService;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public String updatePassword(){
		String password = user.getPassword();
		System.out.println(password+"-----");
		HttpSession session = ServletActionContext.getRequest().getSession();
		int userId = Integer.parseInt(session.getAttribute("userId").toString());
		if(userService.updatePassword(password, userId)){
			return "updatePassword";
		}else{
			return INPUT;
		}
	}
}
