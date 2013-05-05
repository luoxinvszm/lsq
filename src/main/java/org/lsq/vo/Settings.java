package org.lsq.vo;

public class Settings {
	private int settingsId;
	private String settingsName;
	private int settingsValue;

	public int getSettingsId() {
		return settingsId;
	}

	public void setSettingsId(int settingsId) {
		this.settingsId = settingsId;
	}

	public String getSettingsName() {
		return settingsName;
	}

	public void setSettingsName(String settingsName) {
		this.settingsName = settingsName;
	}

	public int getSettingsValue() {
		return settingsValue;
	}

	public void setSettingsValue(int settingsValue) {
		this.settingsValue = settingsValue;
	}

	public String getSettingsRemark() {
		return settingsRemark;
	}

	public void setSettingsRemark(String settingsRemark) {
		this.settingsRemark = settingsRemark;
	}

	private String settingsRemark;
}
