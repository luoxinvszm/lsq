package org.lsq.dao.impl;

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
	


	public User queryUser(String username, String password) {
		String sql = "select * from user where userName=? and userPassword=? ";
		List<Map<String, Object>> list= jdbcTemplate.queryForList(sql, new Object[] { username,
				password });
		if(list!=null && list.size()>0){
				User user=new User();
				user.setUsername(list.get(0).get("userName").toString());
				user.setPassword(list.get(0).get("userPassword").toString());
				user.setRoleId(Integer.parseInt(list.get(0).get("roleId").toString()));
				user.setUserStatus(Integer.parseInt(list.get(0).get("userStatus").toString()));
				user.setUserRemark(list.get(0).get("userRemark")==null?"":list.get(0).get("userRemark").toString());
				return user;
		}
		return null;
	}

}
