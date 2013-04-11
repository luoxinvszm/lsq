package org.lsq.dao;


import java.util.List;

import org.lsq.vo.Message;
public interface IQureyMessageDAO {
	/**
	 * 通过电话号码查询信息(管理员查询),包括所有状态
	 * @param publisherPhone
	 * @return List
	 */
public List<Message> qureyMessagesByPhone(String publisherPhone);

/**
 * 通过电话号码查询信息（管理员和用户通用）
 * @param publsherPhone
 * @param msgStatus
 * @return List
 */
public List<Message> qureyMessagesByPhone(String publsherPhone,int msgStatus);

/**
 * 通过发布时间查询信息(管理员查询),包括所有状态
 * @param publishTime
 * @return	List
 */
public List<Message> qureyMessagesByTime(String publishTime);

/**
 * 通过发布时间查询信息（管理员和用户通用）
 * @param publisTime
 * @param msgStatus
 * @return List
 */
public List<Message> qureyMessagesByTime(String publisTime,int msgStatus);
/**
 * 查询所有信息(某一个状态)
 * @param msgStatus
 * @return	List
 */
public List<Message> qureyMessages(int msgStatus);
}
