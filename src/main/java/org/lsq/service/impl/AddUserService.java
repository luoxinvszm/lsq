package org.lsq.service.impl;

import org.lsq.dao.impl.AddUserDAO;
import org.lsq.service.IAddUserService;

public class AddUserService implements IAddUserService{
	public AddUserDAO addUserDAO;

	public boolean isAddUser(String username, String password, String roleId) {
		System.out.println("添加用户逻辑层-------");
		boolean flag =false;
		if(addUserDAO.AddUser(username, password, roleId)){
			flag =true;
		}
		return flag;
	}

	public AddUserDAO getAddUserDAO() {
		return addUserDAO;
	}

	public void setAddUserDAO(AddUserDAO addUserDAO) {
		this.addUserDAO = addUserDAO;
	}

}
