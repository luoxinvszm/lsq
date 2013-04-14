package org.lsq.service;

public interface IUpdateMessageStatusService {
	/**
	 * 管理员应用的手动删除
	 * @param publisherPhone
	 * @param publishTime
	 * @param msgStatus
	 * @return 0
	 */
	public int deleteMessagestatus(String publisherPhone, String publishTime,
			int msgStatus);
	
	/**
	 * 系统自动进行状态删除的功能
	 * @param publisherPhone
	 * @param publishTime
	 * @param msgStatus
	 * @param mintus
	 * @return 0
	 */
	
	public int deleteMessagestatusAfterTime(String publisherPhone, String publishTime,
			int msgStatus,int mintus);
	
/**
 * 信息的修改，将发布的时间同时覆盖
 * @param publisherPhone
 * @param publishTime
 * @param msgStatus
 * @param mintus
 * @return 0
 */
	public int modifiedMessagestatus(String publisherPhone, String publishTime,
			int msgStatus,int mintus);
}
