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

	public boolean isAddUser(String username, String password, String roleId) {
		System.out.println("添加用户逻辑层-------");
		boolean flag =false;
		if(userDAO.AddUser(username, password, roleId)){
			flag =true;
		}
		return flag;
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
