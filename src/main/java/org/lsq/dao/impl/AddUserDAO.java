package org.lsq.dao.impl;

import org.lsq.dao.IAddUserDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class AddUserDAO implements IAddUserDAO{
	public JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean AddUser(String username, String password, String roleId) {
		System.out.println("添加用户---------");
		String sql = "insert into user (userName,userPassword,roleId) values(?,?,?)";
		jdbcTemplate.update(sql, new Object[]{username,password,roleId});
		return true;
	}

}
