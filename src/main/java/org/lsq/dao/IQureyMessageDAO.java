package org.lsq.dao;


import java.util.List;

import org.lsq.vo.Message;
public interface IQureyMessageDAO {
	/**
	 * 通过电话号码查询信息
	 * @param publisherPhone
	 * @return List
	 */
public List<Message> qureyMessagesByPhone(String publisherPhone);

/**
 * 通过发布时间查询信息
 * @param publishTime
 * @return	List
 */
public List<Message> qureyMessagesByTime(String publishTime);

/**
 * 查询所有信息
 * @return	List
 */
public List<Message> qureyMessages();
}
