package org.lsq.dao;

import java.util.List;

import org.lsq.vo.Settings;

public interface ISystemSettingsDAO {
	public int UpdateSystemSettings(int settingsId, int settingsValue);
	public List<Settings> QuerySystemSetting();
}
