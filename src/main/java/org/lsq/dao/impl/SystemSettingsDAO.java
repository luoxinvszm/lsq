package org.lsq.dao.impl;

import org.lsq.dao.ISystemSettingsDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class SystemSettingsDAO implements ISystemSettingsDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// 根据settings表中的Id字段更新settings表中的value
	public int UpdateSystemSettings(int settingsId, int settingsValue) {
		// TODO Auto-generated method stub
		System.out.println("MessageSettingsDAO……");
		int i = 0;
		String sql = "update settings set settingsValue = ? where settingsId = ?";
		i = jdbcTemplate
				.update(sql, new Object[] { settingsValue, settingsId });
		return i;
	}
}
