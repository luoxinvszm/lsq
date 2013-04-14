package org.lsq.action;

import org.lsq.service.ISystemSettingsService;

import com.opensymphony.xwork2.ActionSupport;

public class SystemSettingsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ISystemSettingsService systemSettingsService;
	public ISystemSettingsService getSystemSettingsService() {
		return systemSettingsService;
	}

	public void setSystemSettingsService(
			ISystemSettingsService systemSettingsService) {
		this.systemSettingsService = systemSettingsService;
	}

	private String method;
	private int settingsId = 0;
	private String settingsValue;

	public String getSettingsValue() {
		return settingsValue;
	}

	public void setSettingsValue(String settingsValue) {
		this.settingsValue = settingsValue;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String UpdateSystemSettings() {
		System.out.println("……");
		System.out.println(method);
		if (method.equals("sendMsgNum")) {
			settingsId = 1;
		}
		if (method.equals("perMsgWords")) {
			settingsId = 2;
		}
		if (method.equals("delReleasedMsgLong")) {
			settingsId = 3;
		}
		if (method.equals("delUnpassedMsgLong")) {
			settingsId = 4;
		}
		System.out.println(settingsValue);
		systemSettingsService.UpdateSystemSettings(settingsId,
				Integer.parseInt(settingsValue));
		return INPUT;
	}
}
