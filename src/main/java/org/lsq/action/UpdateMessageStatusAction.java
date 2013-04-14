package org.lsq.action;

import org.lsq.service.IUpdateMessageStatusService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpdateMessageStatusAction extends ActionSupport {

	private IUpdateMessageStatusService updateMessageStatusService;

	public void setUpdateMessageStatusService(
			IUpdateMessageStatusService updateMessageStatusService) {
		this.updateMessageStatusService = updateMessageStatusService;
	}
	
	private int  status;
	private int mintus;
	private String publisherPhone;
	private String publishTime;
	
	public int getMintus() {
		return mintus;
	}
	
	
	public void setMintus(int mintus) {
		this.mintus = mintus;
	}
	
	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getPublisherPhone() {
		return publisherPhone;
	}


	public void setPublisherPhone(String publisherPhone) {
		this.publisherPhone = publisherPhone;
	}


	public String getPublishTime() {
		return publishTime;
	}


	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}


	public String execute() {
		System.out.println("updateMessageAction starting······");
		// 对状态进行判断，如果是删除状态（3）则应用delete，否则就是修改
		int date = mintus*24*60;
		int i;
		if (status == 3) {
			i = updateMessageStatusService.deleteMessagestatus(publisherPhone,
					publishTime, status);
		} else {
			i = updateMessageStatusService.modifiedMessagestatus(publisherPhone,
					publishTime, status,date);
		}


		System.out.println(i);

		return SUCCESS;
	}
}
