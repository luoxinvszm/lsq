package org.lsq.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.lsq.dao.IUserDAO;
import org.lsq.service.IUserService;
import org.lsq.vo.User;
/**UserService负责对用户进行业务处理,实现IUserService接口
 * @author ylg,yhy
*/
public class UserService implements IUserService{
	private IUserDAO userDAO;

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void cancelUser(long userId){
		 userDAO.setUserStatus(userId, 1);
	}
	public void recoverUser(long userId){
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

	public boolean isAddUser(String username, String password, String roleId,String userRealName,String time) {
		System.out.println("添加用户逻辑层-------");
		boolean flag =false;
		if(userDAO.AddUser(username, password, roleId,userRealName,time)){
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
	public long getuserId(String username,String password){
		User user = userDAO.queryUser(username, password);
		if(user!=null && user.getUserStatus()==0){
			return user.getUserId();
		}else{
			return -1;
		}
	}
	public boolean updatePassword(String password,int userId){
		if(userDAO.updatePassword(password, userId)){
			return true;
		}else{
			return false;
		}
	}
	public String createUsername(){
		String name=userDAO.createUsername();
		return name;
	}
	public boolean resetPassword(long userId){
		if(userDAO.resetPassword(userId)){
			return true;
		}else{
			return false;
		}
	}
	public boolean deleteUser(long userId){
		if(userDAO.deleteUser(userId)){
			return true;
		}else{
			return false;
		}
	}
	public void batchDeleteUsers(final long userIds[]){
		userDAO.batchDeleteUsers(userIds);
	}

	public void batchCancelUser(long userIds[]){
		 userDAO.batchSetUserStatus(userIds, 1);
	}
	public void batchRecoverUser(long userIds[]){
		 userDAO.batchSetUserStatus(userIds, 0);
	}
	
}
