package org.lsq.action;

import java.util.List;

import org.lsq.service.IImageBuilderService;
import org.lsq.service.IQureyMessageService;
import org.lsq.service.IUpdateMessageStatusService;
import org.lsq.vo.Message;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpdateMessageStatusAction extends ActionSupport {

	private IUpdateMessageStatusService updateMessageStatusService;
	private IImageBuilderService imageBuilderService;

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
	private String msg;
	
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
	/*private int  nowStatus ;
	
	
	
	public int getNowStatus() {
		return nowStatus;
	}


	public void setNowStatus(int nowStatus) {
		this.nowStatus = nowStatus;
	}*/

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
			if(status==1){
				System.out.println(msg+"@@@@@@@@@@@@@@@");
				imageBuilderService.createImage(msg);
			}
				
		}
		
		
		System.out.println(i);
	
		return SUCCESS;
	}


	public IImageBuilderService getImageBuilderService() {
		return imageBuilderService;
	}


	public void setImageBuilderService(IImageBuilderService imageBuilderService) {
		this.imageBuilderService = imageBuilderService;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}



