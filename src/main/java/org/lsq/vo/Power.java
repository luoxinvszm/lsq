package org.lsq.vo;
/**
 * 权限实体类：Power
*/
public class Power {
	
	private int powerId;
	private String powerName;
	private String powerAction;
	private int powerStatus;
	private String powerRemark;
	
	public int getPowerId() {
		return powerId;
	}
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
	public String getPowerName() {
		return powerName;
	}
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}
	public int getPowerStatus() {
		return powerStatus;
	}
	public void setPowerStatus(int powerStatus) {
		this.powerStatus = powerStatus;
	}
	public String getPowerRemark() {
		return powerRemark;
	}
	public void setPowerRemark(String powerRemark) {
		this.powerRemark = powerRemark;
	}
	public String getPowerAction() {
		return powerAction;
	}
	public void setPowerAction(String powerAction) {
		this.powerAction = powerAction;
	}
	
}
