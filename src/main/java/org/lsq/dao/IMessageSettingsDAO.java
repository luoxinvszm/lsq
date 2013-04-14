package org.lsq.dao;

public interface IMessageSettingsDAO {
	/**
	 * 
	 * @param settingsName
	 * @param settingsValue
	 * @return
	 */
	public int InsertMessageSettings(String settingsName,int settingsValue );
}
