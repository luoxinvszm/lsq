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

	// **********************通过电话查询*********************************
	
	//不带状态的
	public List<Message> qureyMessagesByPhone(String publisherPhone) {
		System.out.println("qureyMessagesDAObyphone starting······ "+publisherPhone);

		String sql = "select * from message where publisherPhone='"+ publisherPhone + "';";

		System.out.println(sql);
		
		return getMessages(sql);
	}
	
	//带状态的
	public List<Message> qureyMessagesByPhone(String publisherPhone,int msgStatus) {
		
		System.out.println("qureyMessagesDAObyphone (include msgStatus) starting······ "+publisherPhone);
		
		String sql ="select * from message where publisherPhone= '"+publisherPhone+"' and msgStatus= "+msgStatus+";";
		
		System.out.println(sql);
		
		return getMessages(sql);
	}
	// **************************通过时间查询**********************************
	
	//不带状态的
	public List<Message> qureyMessagesByTime(String publishTime) {
	
		System.out.println("qureyMessagesDAObytime starting······ ");
	
		String sql ="select * from message where publishTime like '"+publishTime+"%' ;";
		
		System.out.println(sql);
		
		return getMessages(sql);
	}
	
	//带状态的
	public List<Message> qureyMessagesByTime(String publishTime, int msgStatus) {
		System.out.println("qureyMessagesDAObyTime (include msgStatus) starting······ "+publishTime);
		
		String sql ="select * from message where publishTime like '"+publishTime+"%' and msgStatus= "+msgStatus+";";
		
		System.out.println(sql);
		
		return getMessages(sql);
	}
	// **************************通过时间和电话查询所有************************************
	//带状态的
	public List<Message> qureyMessagesByPhoneAndTime(String publisherPhone,
			String publishTime, int msgStatus) {
		System.out.println("qureyMessagesDAO(include publisherPhone,publishTime,msgStatus) starting······ ");
		
		String sql="select * from message where publisherPhone='"+publisherPhone+"' and publishTime like '"+publishTime+"%' and msgStatus= "+msgStatus+";";
		
		System.out.println(sql);
		
		return getMessages(sql);
	}
	
	//不带状态的
	public List<Message> qureyMessagesByPhoneAndTime(String publisherPhone,
			String publishTime) {
		System.out.println("qureyMessagesDAO(include publisherPhone,publishTime) starting······ ");
		
		String sql="select * from message where publisherPhone='"+publisherPhone+"' and publishTime like '"+publishTime+"%' ;";
		
		System.out.println(sql);
		
		return getMessages(sql);
	}
	// **************************通过状态查询所有************************************
	public List<Message> qureyMessages(int msgStatus) {

		System.out.println("qureyMessagesDAO starting······ ");

		String sql = "select * from message where msgStatus="+msgStatus+";";

		System.out.println(sql);
		
		return getMessages(sql);
	}
	// ****************************************************************************
	//获得message集合的转换方法，将map的转换成list
	@SuppressWarnings("rawtypes")
	public List<Message> getMessages(String sql){
		
		// 返回的messages集合
		
		List<Message> messages = new ArrayList<Message>();
		
		//对sql语句进行处理
		List rows = jdbcTemplate.queryForList(sql);

		//对返回的list进行遍历
		Iterator it = rows.iterator();

		while (it.hasNext()) {
			Map messageMap = (Map) it.next();
			
			//获得map中的每个key对应的value值
			
			int msgId = (Integer) messageMap.get("msgId");
			int msgTypeId = (Integer) messageMap.get("msgTypeId");
			int msgStatus1 = (Integer) messageMap.get("msgStatus");
			String msgConctent = (String) messageMap.get("msgConctent");
			String publisherName = (String) messageMap.get("publisherName");
			String publisherPhone = (String) messageMap.get("publisherPhone");
			String publishTime = (String) messageMap.get("publishTime");
			String msgRemark = (String) messageMap.get("msgRemark");
			
			//  创建对象
			
			Message message = new Message();
			
			 //将值放到对象中
			
			message.setMsgId(msgId);
			message.setMsgTypeId(msgTypeId);
			message.setMsgConctent(msgConctent);
			message.setPublisherName(publisherName);
			message.setPublisherPhone(publisherPhone);
			message.setPublishTime(publishTime);
			message.setMsgRemark(msgRemark);
			message.setMsgStatus(msgStatus1);
			
			//将对象添加到messages集合中
			
			messages.add(message);
		}

		return messages;
	}

	
	
}
