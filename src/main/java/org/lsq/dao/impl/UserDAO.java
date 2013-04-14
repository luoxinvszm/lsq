package org.lsq.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lsq.dao.IUserDAO;
import org.lsq.vo.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAO implements IUserDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

	//查询指定用户信息
	public User queryUser(String username, String password) {
		String sql = "select * from user where userName=? and userPassword=? ";
		List<Map<String, Object>> list= jdbcTemplate.queryForList(sql, new Object[] { username,
				password });
		if(list!=null && list.size()>0){
				User user=new User();
				user.setUserId(Integer.parseInt(list.get(0).get("userId").toString()));
				user.setUsername(list.get(0).get("userName").toString());
				user.setPassword(list.get(0).get("userPassword").toString());
				user.setRoleId(Integer.parseInt(list.get(0).get("roleId").toString()));
				user.setUserStatus(Integer.parseInt(list.get(0).get("userStatus").toString()));
				user.setUserRemark(list.get(0).get("userRemark")==null?"":list.get(0).get("userRemark").toString());
				return user;
		}
		return null;
	}


	//查询全部用户信息
	public List<User> queryUserByRoleId(int roleId) {
		String sql = "select * from user where roleId=?";
		List<Map<String, Object>> list= jdbcTemplate.queryForList(sql,new Object[] {roleId});
		List<User> usersList=new ArrayList<User>();
		if(list!=null && list.size()>0){
			
			Iterator<Map<String, Object>> iter=list.iterator();
			
			while(iter.hasNext()){
				
				Map<String, Object> map=iter.next();
				
				User user=new User();
				
				user.setUserId(Integer.parseInt(map.get("userId").toString()));
				user.setUsername(map.get("userName").toString());
				user.setPassword(map.get("userPassword").toString());
				user.setRoleId(Integer.parseInt(map.get("roleId").toString()));
				user.setUserStatus(Integer.parseInt(map.get("userStatus").toString()));
				user.setUserRemark(map.get("userRemark")==null?"":list.get(0).get("userRemark").toString());
				
				usersList.add(user);
			}
			return usersList;
		}
		return null;
	}

	//注销指定用户
	public int setUserStatus(int userId,int status){
		String sql = "update user set userStatus=? where userid=?";
		return jdbcTemplate.update(sql, new Object[]{status,userId});
	}
	
	public boolean AddUser(String username, String password, String roleId) {
		System.out.println("添加用户---------");
		String sql = "insert into user (userName,userPassword,roleId) values(?,?,?)";
		jdbcTemplate.update(sql, new Object[]{username,password,roleId});
		return true;
	}
	//修改密码
	public boolean updatePassword(String password,int userId){
		System.out.println("修改密码--------");
		String sql="update user set userPassword=? where userid=?";
		jdbcTemplate.update(sql,new Object[]{password,userId});
		return true;
	}
	
	
}
