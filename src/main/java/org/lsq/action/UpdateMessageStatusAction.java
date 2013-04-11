package org.lsq.action;

import org.lsq.service.IUpdateMessageStatusService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpdateMessageStatusAction extends ActionSupport {
private IUpdateMessageStatusService updateMessageStatusService;

public void setUpdateMessageStatusService(
		IUpdateMessageStatusService updateMessageStatusService) {
	this.updateMessageStatusService = updateMessageStatusService;
}

public String execute(){
	System.out.println("updateMessageAction starting······");
	
	int i = updateMessageStatusService.modifiedMessagestatus("123", "2013-03-10 04:30:22", 1);
	
	System.out.println(i);
	
	return SUCCESS;
}
}
