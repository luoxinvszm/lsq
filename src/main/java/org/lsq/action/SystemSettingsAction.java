package org.lsq.action;

import java.util.List;

import org.lsq.service.ISystemSettingsService;
import org.lsq.vo.Settings;

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
	private List<Settings> settings;

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
		//每人每天发送信息次数限制
		if (method.equals("sendMsgNum")) {
			settingsId = 1;
		}
		//每条信息字数限制
		if (method.equals("perMsgWords")) {
			settingsId = 2;
		}
		if (method.equals("defaultPasswords")) {
			settingsId = 3;
		}
		System.out.println(settingsValue);
		systemSettingsService.UpdateSystemSettings(settingsId,
				Integer.parseInt(settingsValue));
		return SUCCESS;
	}
	public String QuerySystemSettings() {
		System.out.println("查询设置");
		 settings=systemSettingsService.QuerySystemSetting();
		System.out.println(settings.size());
		System.out.println(settings.get(0).getSettingsName());
		return SUCCESS;
	}

	public List<Settings> getSettings() {
		return settings;
	}
}
