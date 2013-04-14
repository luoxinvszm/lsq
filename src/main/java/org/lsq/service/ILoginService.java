package org.lsq.service;

public interface ILoginService {
	/**
	 * 判断登录成功与否，登录成功返回该用户roleId，登录失败返回-1
	 */
	int isLogin(String userName,String password);  
}
