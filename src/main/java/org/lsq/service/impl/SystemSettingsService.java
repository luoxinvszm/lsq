package org.lsq.service.impl;

import java.util.List;

import org.lsq.dao.ISystemSettingsDAO;
import org.lsq.service.ISystemSettingsService;
import org.lsq.vo.Settings;

public class SystemSettingsService implements ISystemSettingsService {
	private ISystemSettingsDAO systemSettingsDAO;

	public ISystemSettingsDAO getSystemSettingsDAO() {
		return systemSettingsDAO;
	}

	public void setSystemSettingsDAO(ISystemSettingsDAO systemSettingsDAO) {
		this.systemSettingsDAO = systemSettingsDAO;
	}

	public int UpdateSystemSettings(int settingsId, int settingsValue) {
		// TODO Auto-generated method stub
		System.out.println("MessageSettingsService……");
		systemSettingsDAO.UpdateSystemSettings(settingsId, settingsValue);
		return 0;
	}
	public List<Settings> QuerySystemSetting(){
		return systemSettingsDAO.QuerySystemSetting();
	}

}
