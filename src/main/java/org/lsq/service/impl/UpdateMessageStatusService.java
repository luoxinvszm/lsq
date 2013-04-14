package org.lsq.service.impl;


import org.lsq.dao.IUpdateMessageStatusDAO;
import org.lsq.service.IUpdateMessageStatusService;
import org.lsq.util.DateFormat;

public class UpdateMessageStatusService implements IUpdateMessageStatusService,
		Runnable {
	
	String publisherPhone;
	String publishTime;
	int msgStatus;
	int mintus;
	//构造函数
	public UpdateMessageStatusService(String publisherPhone,
			String publishTime, int msgStatus, int mintus){
		this.publisherPhone = publisherPhone;
		this.publishTime = publishTime;
		this.msgStatus = msgStatus;
		this.mintus = mintus;
	}
	
	
	
	private IUpdateMessageStatusDAO updateMessageStatusDao;

	public void setUpdateMessageStatusDao(
			IUpdateMessageStatusDAO updateMessageStatusDao) {
		this.updateMessageStatusDao = updateMessageStatusDao;
	}

	// 删除:管理员
	public int deleteMessagestatus(String publisherPhone, String publishTime,
			int msgStatus) {

		System.out.println("updateMessageStatusService starting·····");

		// System.out.println(updateMessageStatusDao.modifiedStatus(publisherPhone,
		// publishTime, msgStatus));

		return updateMessageStatusDao.deleteStatus(publisherPhone, publishTime,
				msgStatus);

	}

	// 删除：系统
	public int deleteMessagestatusAfterTime(String publisherPhone,
			String publishTime, int msgStatus, int mintus) {
		

		return updateMessageStatusDao.deleteStatus(publisherPhone, publishTime,
				msgStatus);
	}

	
	
	
	// 修改
	public int modifiedMessagestatus(String publisherPhone, String publishTime,
			int msgStatus,int mintus) {
		int i;
		if (msgStatus == 1) {
			String modifiedDateTime = DateFormat.dateToString();
			i = updateMessageStatusDao.modifiedStatus(publisherPhone,
					publishTime, modifiedDateTime, msgStatus);
			Thread t = new Thread(new UpdateMessageStatusService( publisherPhone,
					 publishTime,  msgStatus,  mintus));
			t.start();
			return i;
		} else {
			String modifiedDateTime = DateFormat.dateToString();
			i = updateMessageStatusDao.modifiedStatus(publisherPhone,
					publishTime, modifiedDateTime, msgStatus);
			return i;
		}

	}
//实现Runnable接口，执行一段时间后
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(mintus * 60 * 1000);
			updateMessageStatusDao.deleteStatus(publisherPhone, publishTime,msgStatus);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
