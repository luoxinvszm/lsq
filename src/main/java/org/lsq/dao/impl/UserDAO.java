package org.lsq.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.lsq.dao.IUserDAO;

public class UserDAO implements IUserDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public boolean checkUser(String username, String password) {
		// TODO Auto-generated method stub

		System.out.println("dao starting······ ");
		String sql = "select count(*) from user where userName=? and userPassword=? ";
		int count = jdbcTemplate.queryForInt(sql, new Object[] { username,
				password });
		return count > 0;
	}

}
