package org.lsq.dao;

import java.util.List;

import org.lsq.vo.Message;

public interface IQureyMessageDAO {
	/**
	 * 通过电话号码查询信息(管理员查询),包括所有状态
	 * 
	 * @param publisherPhone
	 * @return List
	 */
	public List<Message> qureyMessagesByPhone(String publisherPhone,int first,int max);

	/**
	 * 通过电话号码查询信息（管理员和用户通用）
	 * 
	 * @param publsherPhone
	 * @param msgStatus
	 * @return List
	 */
	public List<Message> qureyMessagesByPhone(String publsherPhone,
			int msgStatus,int first,int max);

	/**
	 * 通过发布时间查询信息(管理员查询),包括所有状态
	 * 
	 * @param publishTime
	 * @return List
	 */
	public List<Message> qureyMessagesByTime(String publishTime,int first,int max);

	/**
	 * 通过发布时间查询信息（管理员和用户通用）
	 * 
	 * @param publisTime
	 * @param msgStatus
	 * @return List
	 */
	public List<Message> qureyMessagesByTime(String publishTime, int msgStatus,int first,int max);

	/**
	 * 通过发布时间和电话查询信息（管理员和用户）
	 * 
	 * @param publsherPhone
	 * @param publishTime
	 * @param msgStatus
	 * @return List
	 */
	public List<Message> qureyMessagesByPhoneAndTime(String publisherPhone,
			String publishTime, int msgStatus,int first,int max);

	/**
	 * 通过发布时间和电话查询信息(管理员，所有状态)
	 * 
	 * @param publsherPhone
	 * @param publishTime
	 * @return List
	 */
	public List<Message> qureyMessagesByPhoneAndTime(String publisherPhone,
			String publishTime,int first,int max);

	/**
	 * 查询所有信息(某一个状态)
	 * 
	 * @param msgStatus
	 * @return List
	 */
	public List<Message> qureyMessages(int msgStatus);

	/**
	 * 根据电话号模糊查询
	 * 
	 * @param msgLike
	 * @return List
	 */
	public List<Message> qureyMessagesByPhoneLike(String msgLike);
	
	
	/*yzp 2013-05-17*/
	/**
	 * 查询所有信息(某一个状态)+分页参数
	 * @param msgStatus
	 * @param first
	 * @param max
	 * @return	List
	 */
	public List<Message> qureyMessages(int msgStatus,int first,int max);
	
}
