package org.lsq.vo;

public class Message {
	private long msgId;
	private int msgTypeId;
	private int msgStatus;
	private String msgConctent;
	public int getMsgStatus() {
		return msgStatus;
	}

	public void setMsgStatus(int msgStatus) {
		this.msgStatus = msgStatus;
	}

	private String publisherName;
	private String publisherPhone;
	private String publishTime;
	private String msgRemark;

	

	public long getMsgId() {
		return msgId;
	}

	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}

	public int getMsgTypeId() {
		return msgTypeId;
	}

	public void setMsgTypeId(int msgTypeId) {
		this.msgTypeId = msgTypeId;
	}

	public String getMsgConctent() {
		return msgConctent;
	}

	public void setMsgConctent(String msgConctent) {
		this.msgConctent = msgConctent;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
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

	public String getMsgRemark() {
		return msgRemark;
	}

	public void setMsgRemark(String msgRemark) {
		this.msgRemark = msgRemark;
	}

}
