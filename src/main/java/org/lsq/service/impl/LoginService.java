package org.lsq.service.impl;

import org.lsq.dao.IUserDAO;
import org.lsq.service.ILoginService;
import org.lsq.vo.User;

public class LoginService implements ILoginService{

	private IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}


	public int isLogin(String username, String password) {
		User user=userDAO.queryUser(username, password);
		if(user!=null && user.getUserStatus()==0){
			return user.getRoleId();
		}else{
			return -1;
		}

	}

}
