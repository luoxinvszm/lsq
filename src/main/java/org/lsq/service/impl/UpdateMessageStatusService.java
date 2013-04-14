package org.lsq.service.impl;

import org.lsq.dao.IUpdateMessageStatusDAO;
import org.lsq.service.IUpdateMessageStatusService;

public class UpdateMessageStatusService implements IUpdateMessageStatusService {

	private IUpdateMessageStatusDAO updateMessageStatusDao;
	
	public void setUpdateMessageStatusDao(
			IUpdateMessageStatusDAO updateMessageStatusDao) {
		this.updateMessageStatusDao = updateMessageStatusDao;
	}

	public int modifiedMessagestatus(String publisherPhone,String publishTime, int msgStatus) {

		System.out.println("updateMessageStatusService starting·····");
		
		System.out.println(updateMessageStatusDao.modifiedStatus(publisherPhone, publishTime, msgStatus));
		
		return updateMessageStatusDao.modifiedStatus(publisherPhone, publishTime, msgStatus);
	
	}

}
