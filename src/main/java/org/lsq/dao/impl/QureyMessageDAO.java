package org.lsq.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lsq.dao.IQureyMessageDAO;
import org.lsq.vo.Message;
import org.springframework.jdbc.core.JdbcTemplate;

public class QureyMessageDAO implements IQureyMessageDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// **************************************************************************
	@SuppressWarnings("rawtypes")
	public List<Message> qureyMessagesByPhone(String publisherPhone) {
		System.out.println("qureyMessagesDAObyphone starting······ "+publisherPhone);

		List<Message> messages = new ArrayList<Message>();// 返回的message集合

		String sql = "select * from message where publisherPhone='"
				+ publisherPhone + "';";

		List rows = jdbcTemplate.queryForList(sql);

		Iterator it = rows.iterator();

		while (it.hasNext()) {

			Map messageMap = (Map) it.next();
			/*
			 * 获得map中的每个key对应的value值
			 */
			int msgId = (Integer) messageMap.get("msgId");
			int msgTypeId = (Integer) messageMap.get("msgTypeId");
			String msgConctent = (String) messageMap.get("msgConctent");
			String publisherName = (String) messageMap.get("publisherName");
			String publishPhone = (String) messageMap.get("publisherPhone");
			String publishTime = (String) messageMap.get("publishTime");
			String msgRemark = (String) messageMap.get("msgRemark");
			/*
			 * 创建对象
			 */
			Message message = new Message();
			/*
			 * 将值放到对象中
			 */
			message.setMsgId(msgId);
			message.setMsgTypeId(msgTypeId);
			message.setMsgConctent(msgConctent);
			message.setPublisherName(publisherName);
			message.setPublisherPhone(publishPhone);
			message.setPublishTime(publishTime);
			message.setMsgRemark(msgRemark);
			/*
			 * 将对象添加到集合中
			 * */
			messages.add(message);
		}
	
		return messages;
	}

	// **************************************************************************
	public List<Message> qureyMessagesByTime(String publishTime) {
		System.out.println("qureyMessagesDAObytime starting······ ");
		return null;
	}

	// **************************************************************************
	@SuppressWarnings("rawtypes")
	public List<Message> qureyMessages() {

		System.out.println("qureyMessagesDAO starting······ ");

		List<Message> messages = new ArrayList<Message>();// 返回的message集合

		String sql = "select * from message;";

		List rows = jdbcTemplate.queryForList(sql);

		Iterator it = rows.iterator();

		while (it.hasNext()) {

			Map messageMap = (Map) it.next();
			/*
			 * 获得map中的每个key对应的value值
			 */
			//System.out.println(messageMap.get("msgId"));
			
			int msgId = (Integer) messageMap.get("msgId");
			int msgTypeId = (Integer) messageMap.get("msgTypeId");
			String msgConctent = (String) messageMap.get("msgConctent");
			String publisherName = (String) messageMap.get("publisherName");
			String publisherPhone = (String) messageMap.get("publisherPhone");
			String publishTime = (String) messageMap.get("publishTime");
			String msgRemark = (String) messageMap.get("msgRemark");
			
			/*System.out.println(msgId);
			System.out.println(msgTypeId);
			System.out.println(msgConctent);
			System.out.println(publisherName);
			System.out.println(publisherPhone);
			System.out.println(publishTime);
			System.out.println(msgRemark);*/
			
			/*
			 * 创建对象
			 */
			
			Message message = new Message();
			
			/*
			 * 将值放到对象中
			 */
			message.setMsgId(msgId);
			message.setMsgTypeId(msgTypeId);
			message.setMsgConctent(msgConctent);
			message.setPublisherName(publisherName);
			message.setPublisherPhone(publisherPhone);
			message.setPublishTime(publishTime);
			message.setMsgRemark(msgRemark);
			
			
			messages.add(message);
		}

		return messages;
	}

}
