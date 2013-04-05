package org.lsq.dao;


public interface IInsertMessageDAO {
	/**
	 * 将信息插入到数据库中
	 * @param messageContext
	 * @param publisherName
	 * @param publisherPhone
	 * @param publishTime
	 * @param msgRemark
	 * @return true
	 * 
	 * @author qinhua 
	 */
	public int insertMessage(String messageContext, String publisherName,
			String publisherPhone,String publishTime ,String msgRemark);
}
