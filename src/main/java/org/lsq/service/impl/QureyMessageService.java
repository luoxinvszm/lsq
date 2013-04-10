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

	/*
	 * 判断字符串是否为数字组成
	 */
	public boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	public List<Message> checkQuery(String anything) {
		if (anything.equals("")) {
			System.out.println("qureymessageservice starting······");
			return qureyMessageDao.qureyMessages();
			
		} else if (isNumeric(anything)) {
			System.out.println("qureymessageservicebyphone starting······");

			return qureyMessageDao.qureyMessagesByPhone(anything);
			
		} else {
			System.out.println("qureymessageservicebytime starting······");

			return qureyMessageDao.qureyMessagesByTime(anything);

		}
	}

}
