package org.lsq.action;

import java.util.List;

import org.lsq.service.IQureyMessageService;
import org.lsq.service.IUpdateMessageStatusService;
import org.lsq.vo.Message;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpdateMessageStatusAction extends ActionSupport {

	private IUpdateMessageStatusService updateMessageStatusService;

	public void setUpdateMessageStatusService(
			IUpdateMessageStatusService updateMessageStatusService) {
		this.updateMessageStatusService = updateMessageStatusService;
	}
	private IQureyMessageService qureyMessageService;

	public void setQureyMessageService(IQureyMessageService qureyMessageService) {
		this.qureyMessageService = qureyMessageService;
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
//集合的注入
	private List<Message> messageList;

	public List<Message> getMessageList() {
		return messageList;
	}
	//查询时所需要的现时的状态
	private int  nowStatus ;
	
	
	
	public int getNowStatus() {
		return nowStatus;
	}


	public void setNowStatus(int nowStatus) {
		this.nowStatus = nowStatus;
	}

//执行方法
	public String execute() {
		System.out.println("updateMessageAction starting······"+status);
		// 对状态进行判断，如果是删除状态（3）则应用delete，否则就是修改
		int date = mintus;
		int i;
		if (status == 3) {
			i = updateMessageStatusService.deleteMessagestatus(publisherPhone,
					publishTime, status);
		} else {
			i = updateMessageStatusService.modifiedMessagestatus(publisherPhone,
					publishTime, status,date);
				
		}
		messageList = qureyMessageService.checkQuery("", "", nowStatus,0,0);
		
		//System.out.println(i);
		System.out.println("#########################");
		for (Message m : messageList) {
			System.out.println(m.getMsgId());
			System.out.println(m.getMsgTypeId());
			System.out.println(m.getPublisherName());
			System.out.println(m.getPublisherPhone());
			System.out.println(m.getMsgRemark());
			System.out.println(m.getPublishTime());
			System.out.println(m.getMsgConctent());
			System.out.println(m.getMsgStatus());
		}
		System.out.println("#########################");

		return SUCCESS;
	}
}
