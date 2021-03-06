package org.lsq.dao;

import java.util.List;

import org.lsq.vo.User;
/**
 * 类名：IUserDao
 * 作用：访问数据库中user表
 * */
public interface IUserDAO {
	/**
	 *查询数据库中user表，将查询结果封装到User对象中，并返回。
	 */	 
	public User queryUser(String username,String password);
	/**
	 *查询指定角色的用户信息，结果封装到List<User>中，并返回。
	 */	
	public List<User> queryUserByRoleId(int roleId);
	/**
	 *设置user表中用户状态userStatus。
	 */
	public int setUserStatus(long userId,int status);
	/**
	 *设置user表中用户状态userStatus。
	 */
	public int setUserStatuss(String username,int status);
	/**
	 *向user表中插入一条新记录
	 */
	public boolean AddUser(String username, String password, String roleId,String userRealName,String time);
	/**
	 *修改user表中userPassword字段
	 */
	public boolean updatePassword(String password,int userId);
	/**
	 * 创建user
	 * */
	public String createUsername();
	/**
	 * 密码重置
	 * */
	public boolean resetPassword(String username);
	/**
	 * 删除管理员
	 * */
	public boolean deleteUser(String username);
	/**
	 * 批量删除管理员
	 * */
	public void batchDeleteUsers(final String usernames[]);
	/**
	 * 批量修改管理员状态(可用，冻结)
	 * */
	public void batchSetUserStatus(final String username[],final int status);
}
	