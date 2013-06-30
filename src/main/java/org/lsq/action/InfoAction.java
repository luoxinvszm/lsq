package org.lsq.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.lsq.service.IInfoService;
import org.lsq.service.IQureyMessageService;
import org.lsq.util.DateFormat;
import org.lsq.util.PagingUtil;
import org.lsq.vo.Info;
import org.lsq.vo.Message;

import com.opensymphony.xwork2.ActionSupport;

public class InfoAction  extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IInfoService infoService;
	private IQureyMessageService queryMessageService;
	private List<Message> stuList;
	private List<Info> schoolList;
	private List<Info> busList;
	private Integer totalSize;
	
	private String infoTitle;
	private String infoContent;
	private String userName;
	private Integer infoType;
	
	public String getInfoTitle() {
		return infoTitle;
	}

	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle;
	}

	public String getInfoContent() {
		return infoContent;
	}

	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getInfoType() {
		return infoType;
	}

	public void setInfoType(Integer infoType) {
		this.infoType = infoType;
	}

	public IQureyMessageService getQueryMessageService() {
		return queryMessageService;
	}

	public void setQueryMessageService(IQureyMessageService queryMessageService) {
		this.queryMessageService = queryMessageService;
	}

	public List<Message> getStuList() {
		return stuList;
	}

	public void setStuList(List<Message> stuList) {
		this.stuList = stuList;
	}

	public List<Info> getSchoolList() {
		return schoolList;
	}

	public void setSchoolList(List<Info> schoolList) {
		this.schoolList = schoolList;
	}

	public List<Info> getBusList() {
		return busList;
	}

	public void setBusList(List<Info> busList) {
		this.busList = busList;
	}

	public Integer getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public IInfoService getInfoService() {
		return infoService;
	}

	public void setInfoService(IInfoService infoService) {
		this.infoService = infoService;
	} 
		
	
	public String queryStuInfo() {
			System.out.println("queryInfo starting yzp 2013-06-29····");
			HttpServletRequest request = ServletActionContext.getRequest();
			Integer[] args = PagingUtil.getPagingParameter(request);
			stuList = queryMessageService.checkQuery("","",1,args[2],args[1]);
			totalSize=queryMessageService.checkQuery("","",1,0,0).size();
			//System.out.println("messageList.size()="+messageList.size());
			return SUCCESS;
		}

		public String querySchoolInfo() {
			System.out.println("querySchoolInfo starting yzp 2013-06-29····");
			try{
				HttpServletRequest request = ServletActionContext.getRequest();
				Integer[] args = PagingUtil.getPagingParameter(request);
				schoolList = infoService.queryInfo(0, 1, args[2], args[1]);
				totalSize = infoService.queryInfo(0, 1, 0, 0).size();
			}catch(Exception e){
				e.printStackTrace();
			}
			return SUCCESS;
		}
		
		public String queryBusInfo() {
			System.out.println("queryBusInfo starting yzp 2013-06-29····");
			try{
				HttpServletRequest request = ServletActionContext.getRequest();
				Integer[] args = PagingUtil.getPagingParameter(request);
				busList = infoService.queryInfo(0, 0, args[2], args[1]);
				totalSize = infoService.queryInfo(0, 0, 0, 0).size();
			}catch(Exception e){
				e.printStackTrace();
			}
			return SUCCESS;
		}
		
		public String insertInfo() {
			System.out.println("insertInfo starting yzp 2013-06-30····");
			System.out.println("infoTitle="+infoTitle);
			String infoDate=DateFormat.dateToString();//获取系统当前时间
		    infoService.insertInfo(infoTitle, infoContent,"",infoDate, userName, infoType, 0);
		
			return SUCCESS;
		}
		
		
		
		

}
