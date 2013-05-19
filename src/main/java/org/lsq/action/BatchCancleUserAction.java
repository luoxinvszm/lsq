package org.lsq.action;

import org.lsq.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

public class BatchCancleUserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userIds;
	private IUserService userService;
	private String sta;
	public String getSta() {
		return sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	public String getUserIds() {
		return userIds;
	}
	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public String execute(){
		System.out.println(userIds);
		String[] words=userIds.split(",");
		if("0".equals(sta)){
		userService.batchCancelUser(words);
		}else if("1".equals(sta)){
			userService.batchRecoverUser(words);
		}
		return SUCCESS;
	}
}
