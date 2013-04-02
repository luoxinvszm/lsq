package org.lsq.service.impl;

import org.lsq.dao.IInsertMessageDAO;
import org.lsq.service.IInsertMessageService;

public class InsertMessageService implements IInsertMessageService {

	private IInsertMessageDAO insertMessageDAO ;
	


	public void setInsertMessageDAO(IInsertMessageDAO insertMessageDAO) {
		this.insertMessageDAO = insertMessageDAO;
	}

	public int isInsertMessage(String messageContext, String publisherName,
			String publisherPhone, String msgRemark) {
		// TODO Auto-generated method stub
		System.out.println("insertMessageService starting····");
		
		int flag = insertMessageDAO.insertMessage(messageContext, publisherName, publisherPhone, msgRemark);
		
		if(flag != 0){
			return flag;
		}
		else{
			return 0;
		}
	}

}
