package org.lsq.service;

import java.util.List;

import org.lsq.vo.User;

public interface IUserService {
	/**
	 * 判断登录成功与否，登录成功返回该用户roleId，登录失败返回-1
	 */
	int isLogin(String userName,String password); 
	/**
	 * 查询指定指定角色的用户信息
	 */
	public List<User> queryUsersByRoleId(int roleId,int status);
	/**
	 * 冻结管理员账号
	 */
	public void cancelUser(int userId);
	/**
	 * 恢复管理员账号
	 */
	public void recoverUser(int userId);
	/**
	 * 创建管理员
	 */
	public boolean isAddUser(String username,String password,String roleId);
}
