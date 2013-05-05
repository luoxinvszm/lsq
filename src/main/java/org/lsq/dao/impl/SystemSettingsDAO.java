package org.lsq.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lsq.dao.ISystemSettingsDAO;
import org.lsq.vo.Message;
import org.lsq.vo.Settings;
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

	public List<Settings> QuerySystemSetting() {
		// TODO Auto-generated method stub
		String sql= "select * from settings";
		return getSettings(sql);
	}
	public List<Settings> getSettings(String sql){
		
		// 返回的messages集合
		
		List<Settings> settings = new ArrayList<Settings>();
		
		//对sql语句进行处理
		List rows = jdbcTemplate.queryForList(sql);

		//对返回的list进行遍历
		Iterator it = rows.iterator();

		while (it.hasNext()) {
			Map settingMap = (Map) it.next();
			
			//获得map中的每个key对应的value值
			int settingsId = (Integer) settingMap.get("settingsId");
			String settingsName = (String) settingMap.get("settingsName");
			int settingsValue= (Integer) settingMap.get("settingsValue");
			String settingsRemark = (String) settingMap.get("settingsRemark");
			
			//  创建对象
			
			Settings setting = new Settings();
			
			 //将值放到对象中
			setting.setSettingsId(settingsId);
			setting.setSettingsName(settingsName);
			setting.setSettingsValue(settingsValue);
			setting.setSettingsRemark(settingsRemark);
			
			//将对象添加到messages集合中
			
			settings.add(setting);
		}

		return settings;
	}
}
