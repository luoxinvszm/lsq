package org.lsq.dao;

import org.lsq.vo.User;
public interface IUserDAO {
	/**
	 *查询数据库中user表，将查询结果封装到User对象中，并返回。
	 */	 
	public User queryUser(String username,String password);

}
