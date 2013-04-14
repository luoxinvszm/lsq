package org.lsq.service;

public interface ISystemSettingsService {
	/**
	 * 
	 * @param settingsName
	 * @param settingsValue
	 * @return
	 */
	public int UpdateSystemSettings(int settingsId, int settingsValue);
}
