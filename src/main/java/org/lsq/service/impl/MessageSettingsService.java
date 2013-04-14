package org.lsq.service.impl;

import org.lsq.dao.IMessageSettingsDAO;
import org.lsq.service.IMessageSettingsService;

public class MessageSettingsService implements IMessageSettingsService {
	private IMessageSettingsDAO messageSettingsDAO;

	public IMessageSettingsDAO getMessageSettingsDAO() {
		return messageSettingsDAO;
	}

	public void setMessageSettingsDAO(IMessageSettingsDAO messageSettingsDAO) {
		this.messageSettingsDAO = messageSettingsDAO;
	}

	public int InsertMessageSettings(String settingsName, int settingsValue) {
		// TODO Auto-generated method stub
		System.out.println("MessageSettingsService……");
		messageSettingsDAO.InsertMessageSettings(settingsName, settingsValue);
		return 0;
	}

}
