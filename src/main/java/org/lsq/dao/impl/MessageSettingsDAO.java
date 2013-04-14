package org.lsq.dao.impl;

import org.lsq.dao.IMessageSettingsDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class MessageSettingsDAO implements IMessageSettingsDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int InsertMessageSettings(String settingsName, int settingsValue) {
		// TODO Auto-generated method stub
		System.out.println("MessageSettingsDAO……");

		String sql = "insert into settings(settingsName,settingsValue,settingsRemark) values('"
				+ settingsName
				+ "','"
				+ settingsValue
				+ "','"
				+ "settingsRemark" + "');";
		int i = 0;
		i = jdbcTemplate.update(sql);

		return 0;
	}
}
