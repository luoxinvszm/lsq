package org.lsq.service;

import java.util.List;

import org.lsq.vo.Message;

public interface IQureyMessageService {
	/**
	 * 通过传入的参数判断使用哪种方法查询
	 * @param publisherPhone
	 * @param publishTime
	 * @param msgStatus
	 * @return	List
	 */
	//public List<Message> checkQuery(String publisherPhone,String publishTime,int msgStatus);
	/**
	 * 根据电话号模糊查询
	 * 
	 * @param msgLike
	 * @return List
	 */
	public List<Message> qureyMessagesByPhoneLike(String msgLike);
	
	
	/*yzp 2013-05-19*/
	/**
	 * 通过传入的参数判断使用哪种方法查询
	 * @param publisherPhone
	 * @param publishTime
	 * @param msgStatus
	 * @param first
	 * @param max
	 * @return	List
	 */
	public List<Message> checkQuery(String publisherPhone,String publishTime,int msgStatus,int first,int max);
}
