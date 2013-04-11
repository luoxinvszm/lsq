package org.lsq.dao.impl;

import org.lsq.dao.IUpdateMessageStatusDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateMessageStatusDAO implements IUpdateMessageStatusDAO{

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	//对状态进行修改
	public int modifiedStatus(String publisherPhone,String publishTime, int msgStatus) {
		
		System.out.println("updateMessageStatusDAO(including pubilsherPhone) starting·······");
	//	System.out.println(publisherPhone+" + "+publishTime+" + "+msgStatus);
		int i = jdbcTemplate.update("update message set msgStatus = ? where publisherPhone = ? and publishTime = ?", new Object[] {msgStatus, publisherPhone,publishTime});
		
	//	System.out.println(i);
		
		return i;
	}

}
