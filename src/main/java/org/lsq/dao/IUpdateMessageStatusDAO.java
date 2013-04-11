package org.lsq.dao;

public interface IUpdateMessageStatusDAO {
/**
 * 对信息的状态进行修改
 * @param pubilsherPhone
 * @param msgStatus
 * @return	0
 */
	public int modifiedStatus(String publisherPhone,String publishTime, int msgStatus);
}
