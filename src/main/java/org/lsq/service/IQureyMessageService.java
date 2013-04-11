package org.lsq.service;

import java.util.List;

import org.lsq.vo.Message;

public interface IQureyMessageService {
	/**
	 * 判断使用哪种查询方式
	 * @param anything
	 * @return List<Message>
	 */
	public List<Message> checkQuery(String anything,int msgStatus);
}
