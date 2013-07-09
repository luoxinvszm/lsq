package org.lsq.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lsq.dao.IUserDAO;
import org.lsq.util.CipherUtil;
import org.lsq.util.NameUtil;
import org.lsq.util.IdBuilder;

import org.lsq.vo.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 *负责数据库user表访问类 ，实现IUserDAO
 *@author ylg,yhy
*/
public class UserDAO implements IUserDAO {

	private JdbcTemplate jdbcTemplate;
	NameUtil n = new NameUtil();
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
				user.setUserId(Long.parseLong(list.get(0).get("userId").toString()));
				user.setUsername(list.get(0).get("userName").toString());
				user.setPassword(list.get(0).get("userPassword").toString());
				user.setRoleId(Integer.parseInt(list.get(0).get("roleId").toString()));
				user.setUserStatus(Integer.parseInt(list.get(0).get("userStatus").toString()));
				user.setUserRemark(list.get(0).get("userRemark")==null?"":list.get(0).get("userRemark").toString());
				user.setUserRealName(list.get(0).get("userRealName").toString());
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
				user.setUserId(Long.parseLong(map.get("userId").toString()));
				user.setUsername(map.get("userName").toString());
				user.setPassword(map.get("userPassword").toString());
				user.setRoleId(Integer.parseInt(map.get("roleId").toString()));
				user.setUserStatus(Integer.parseInt(map.get("userStatus").toString()));
				user.setUserRemark(map.get("userRemark")==null?"":list.get(0).get("userRemark").toString());
				user.setUserRealName(map.get("userRealName").toString());
				usersList.add(user);
				System.out.println(user.getUserId()+"----------"+user.getUserRealName());
			}
			return usersList;
		}
		return null;
	}
	
	//注销指定用户
	public int setUserStatus(long userId,int status){
		String sql = "update user set userStatus=? where userid=?";
		return jdbcTemplate.update(sql, new Object[]{status,userId});
	}
	public int setUserStatuss(String username,int status){
		String sql = "update user set userStatus=? where userName=?";
		return jdbcTemplate.update(sql, new Object[]{status,username});
	}
	public boolean AddUser(String username, String password, String roleId,String userRealName,String time) {
		System.out.println("添加用户---------");
		String sql = "insert into user (userId,userName,userPassword,roleId,userRealName,userCreateTime) values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[]{IdBuilder.getNewId(),username,password,roleId,userRealName,time});
		return true;
	}
	@SuppressWarnings("unused")
	public String createUsername(){
		String name=n.generateName();
		String sql="select * from user where userName='"+name+"'";
		try {
			List<Map<String,Object>> list= jdbcTemplate.queryForList(sql);
			System.out.println("count="+list.size());
			if(list==null && list.size()==0){
				return createUsername();
			}else{
				return name;
			}
		} catch (EmptyResultDataAccessException  e) {
			return null;
		}
	
	}
	//修改密码
	public boolean updatePassword(String password,int userId){
		System.out.println("修改密码--------");
		String sql="update user set userPassword=? where userid=?";
		jdbcTemplate.update(sql,new Object[]{password,userId});
		return true;
	}
	//密码重置
	public boolean resetPassword(String username){
		System.out.println("密码重置--------");
		String password=CipherUtil.encodeByMD5("111111");
		String sql = "update user set userPassword='"+password+"' where userName=?";
		jdbcTemplate.update(sql,new Object[]{username});
		return true;
	}
	//删除管理员
	public boolean deleteUser(String username){
		System.out.println("删除管理员------");
		String sql= "delete from user where userName=?";
		jdbcTemplate.update(sql,new Object[]{username});
		return true;	
	}
	//批量删除
	public boolean deleteBatchUser(long[] userId){
		System.out.println("批量删除");
		String id="";
		for (int i = 0; i < userId.length; i++) {
			if(i!=userId.length-1){
			id+=userId[i]+",";
			}else{
				id+=userId[i];
			}
		}
		String sql = "delete from user where userId in ("+id+")";
		jdbcTemplate.update(sql);
		return true;
	}
	//批量删除
	public  void batchDeleteUsers(final String usernames[]){
		String sql="delete from user where userName=?";
		BatchPreparedStatementSetter pss=new BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setString(1, usernames[i]);
			}
			
			public int getBatchSize() {
				return usernames.length;
			}
		};
		jdbcTemplate.batchUpdate(sql, pss);
	}
	//批量修改状态
	public void batchSetUserStatus(final String usernames[],final int status){
		String sql="update user set userStatus=? where userName=?";
		BatchPreparedStatementSetter pss=new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setInt(1, status);
				ps.setString(2, usernames[i]);
			}
			public int getBatchSize() {
				return usernames.length;
			}
		};
		jdbcTemplate.batchUpdate(sql, pss);
	}
	
}
