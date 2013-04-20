package org.lsq.service;

import java.util.List;

import org.lsq.vo.Settings;

public interface ISystemSettingsService {
	/**
	 * 
	 * @param settingsName
	 * @param settingsValue
	 * @return
	 */
	public int UpdateSystemSettings(int settingsId, int settingsValue);
	public List<Settings> QuerySystemSetting();
}
