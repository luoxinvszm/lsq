package org.lsq.service;

import java.util.List;

import org.lsq.vo.User;
/**
 * IUserService负责对用户进行业务处理
 * @author ylg,yhy
*/
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
	public void cancelUser(long userId);
	/**
	 * 恢复管理员账号
	 */
	public void recoverUser(long userId);
	/**
	 * 创建管理员
	 */
	public boolean isAddUser(String username,String password,String roleId,String userRealName,String time);
	/**
	 * 查询userId
	 */
	public long getuserId(String username,String password);
	/**
	 * 修改密码
	 * */
	public boolean updatePassword(String password,int userId);
	/**
	 * 创建账号
	 * */
	public String createUsername();
	/**
	 * 密码重置
	 * */
	public boolean resetPassword(long userId);
}
