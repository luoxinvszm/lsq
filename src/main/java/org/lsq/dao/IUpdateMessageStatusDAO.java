package org.lsq.dao;

public interface IUpdateMessageStatusDAO {
/**
 * 对信息的状态进行修改,将信息的状态改为删除状态
 * @param pubilsherPhone
 * @param msgStatus
 * @return	0
 */
	public int deleteStatus(String publisherPhone,String publishTime, int msgStatus);
/**
 * 对信息的修改，将信息状态改为已发布或未通过状态
 * @param publisherPhone
 * @param publishTime
 * @param modifiedDateTime
 * @param msgStatus
 * @return	0
 */
	public int modifiedStatus(String publisherPhone,String publishTime,String modifiedDateTime, int msgStatus);


}
