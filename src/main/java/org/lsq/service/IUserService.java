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
	 * 冻结管理员账号
	 */
	public void cancelUsers(String uername);
	/**
	 * 恢复管理员账号
	 */
	public void recoverUsers(String username);
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
	 * 批量冻结管理员
	 * */
	public void batchCancelUser(String usernames[]);
	/**
	 * 批量激活管理员
	 * */
	public void batchRecoverUser(String usernames[]);
	/**
	 * 查询用户信息(根据账号和密码)
	 * */
	public User queryUser(String username,String password);
}
