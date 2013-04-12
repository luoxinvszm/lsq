package org.lsq.dao;

import java.util.List;

import org.lsq.vo.User;
public interface IUserDAO {
	/**
	 *查询数据库中user表，将查询结果封装到User对象中，并返回。
	 */	 
	public User queryUser(String username,String password);
	public List<User> queryUserByRoleId(int roleId);
	public int setUserStatus(int userId,int status);
	public boolean AddUser(String username, String password, String roleId);
}
