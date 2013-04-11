package org.lsq.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.lsq.dao.IUserDAO;
import org.lsq.service.IUserService;
import org.lsq.vo.User;

public class UserService implements IUserService{
	private IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void cancelUser(int userId){
		 userDAO.setUserStatus(userId, 1);
	}
	public void recoverUser(int userId){
		 userDAO.setUserStatus(userId, 0);
	}
	
	public List<User> queryUsersByRoleId(int roleId,int status){
		List<User> users=new ArrayList<User>();
		List<User> result=userDAO.queryUserByRoleId(roleId);
		Iterator<User> iter=result.iterator();
		while(iter.hasNext()){
			User user=iter.next();
			if(user.getUserStatus()==status){
				users.add(user);
			}
		}
		return users;
	}
	
}
