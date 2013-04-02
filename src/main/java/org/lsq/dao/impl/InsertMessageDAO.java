package org.lsq.dao.impl;


import org.lsq.dao.IInsertMessageDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertMessageDAO implements IInsertMessageDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertMessage(String messageContext, String publisherName,
			String publisherPhone, String msgRemark) {
		
		System.out.println("insertMessageDAO starting······");
		
		String sql="insert into message (msgConctent,publisherName,publisherPhone,msgRemark) values ('"+messageContext+"','"+publisherName+"','"+publisherPhone+"','"+msgRemark+"');";
		
		int  i = 0;
		
		
		i = jdbcTemplate.update(sql);
		return i;
		
	}

}
