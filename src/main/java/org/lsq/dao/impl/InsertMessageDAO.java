package org.lsq.dao.impl;

import org.lsq.dao.IInsertMessageDAO;
import org.lsq.util.IdBuilder;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertMessageDAO implements IInsertMessageDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertMessage(String messageContext, String publisherName,
			String publisherPhone, String publishTime, String msgRemark) {
		
		System.out.println("insertMessageDAO starting······");

		long msgId = IdBuilder.getNewId(); //随机获取主键值
		String sql = "insert into message (msgId,msgTypeId,msgConctent,publisherName,publisherPhone,publishTime,msgRemark,msgStatus) values ('"
				+ msgId
				+ "','"
				+ 1
				+ "','"
				+ messageContext
				+ "','"
				+ publisherName
				+ "','"
				+ publisherPhone
				+ "','"
				+ publishTime
				+ "','"
				+ msgRemark
				+ "','"
				+ 0
				+ "');";

		int i = 0;
		i = jdbcTemplate.update(sql);
		return i;

	}

}
