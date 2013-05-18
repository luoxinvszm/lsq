package org.lsq.dao.impl;

import org.lsq.dao.IUpdateMessageStatusDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateMessageStatusDAO implements IUpdateMessageStatusDAO{

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	//对状态进行修改,把发布的状态改为删除的状态
	public int deleteStatus(String publisherPhone,String publishTime, int msgStatus) {
		
		System.out.println("deleteMessageStatusDAO(including pubilsherPhone) starting·······");
	//	System.out.println(publisherPhone+" + "+publishTime+" + "+msgStatus);
		int i = jdbcTemplate.update("update message set msgStatus = ? where publisherPhone = ? and publishTime = ?", new Object[] {msgStatus, publisherPhone,publishTime});
		
	//	System.out.println(i);
		
		return i;
	}

	
	//对状态进行修改,把信息状态改为发布的状态
	
	public int modifiedStatus(String publisherPhone, String publishTime,
			String modifiedDateTime, int msgStatus) {
		
		System.out.println("modifiedMessageStatusDAO(including pubilsherPhone) starting·······");
		
		int i = jdbcTemplate.update("update message set msgStatus = ? ,publishTime = ?where publisherPhone = ? and publishTime = ?", new Object[] {msgStatus,modifiedDateTime, publisherPhone,publishTime});
		System.out.println("********"+i);
		return i;
	}
	
	

}
