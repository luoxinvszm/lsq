package org.lsq.service.impl;

import org.lsq.service.ILoginService;
import org.lsq.dao.IUserDAO;

public class LoginService implements ILoginService{

	private IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public boolean isLogin(String username, String password) {
		System.out.println("service starting······");
		boolean flag = false;
		if (userDAO.checkUser(username, password)) {
			flag = true;
		}
		return flag;

	}

}
