package org.lsq.service;

public interface IMessageSettingsService {
	/**
	 * 
	 * @param settingsName
	 * @param settingsValue
	 * @return
	 */
	public int InsertMessageSettings(String settingsName, int settingsValue);
}
