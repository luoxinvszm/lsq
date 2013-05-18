package org.lsq.service.impl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.lsq.dao.IQureyMessageDAO;
import org.lsq.service.IQureyMessageService;
import org.lsq.vo.Message;

public class QureyMessageService implements IQureyMessageService {

	private IQureyMessageDAO qureyMessageDao;

	public void setQureyMessageDao(IQureyMessageDAO qureyMessageDao) {
		this.qureyMessageDao = qureyMessageDao;
	}

	
//	 判断字符串是否为数字组成

	public boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

//判断前台的参数符合那种条件
	public List<Message> checkQuery(String publisherPhone, String publishTime,
			int msgStatus) {
		if(publisherPhone.equals("") &&publishTime.equals("")){
			
			System.out.println("qureyMessageService (including msgStatus) starting·····");
			
			return qureyMessageDao.qureyMessages(msgStatus);
		}
		else if(!publisherPhone.equals("")&&!publishTime.equals("")){
			
			System.out.println("qureyMessageService (including publisherPhone,publishTime,msgStatus) starting·····");
			
			return qureyMessageDao.qureyMessagesByPhoneAndTime(publisherPhone, publishTime, msgStatus);
		}
		else if(!publisherPhone.equals("")&&publishTime.equals("")){
			
			System.out.println("qureyMessageService (including publisherPhone,msgStatus) starting·····");
			
			return qureyMessageDao.qureyMessagesByPhone(publisherPhone, msgStatus);
		}
		else{
			
			System.out.println("qureyMessageService (including publisherPhone,msgStatus) starting·····");
			
			return qureyMessageDao.qureyMessagesByTime(publishTime, msgStatus);

		}
	}


	public List<Message> qureyMessagesByLike(String msgLike) {
		// TODO Auto-generated method stub
		return qureyMessageDao.qureyMessagesByLike(msgLike);
	}

}
