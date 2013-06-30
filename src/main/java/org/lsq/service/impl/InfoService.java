package org.lsq.service.impl;

import java.util.List;

import org.lsq.dao.IInfoDAO;
import org.lsq.service.IInfoService;
import org.lsq.vo.Info;
/**
 * 
 * @author Jason
 *
 */
public class InfoService implements IInfoService {
	 private IInfoDAO infoDAO;
	 
	public IInfoDAO getInfoDAO() {
		return infoDAO;
	}

	public void setInfoDAO(IInfoDAO infoDAO) {
		this.infoDAO = infoDAO;
	}
	/**
	 * 查询info
	 * @param infoState
	 * @param infoType
	 * @param firdt
	 * @param max
	 * @return
	 */
	public List<Info> queryInfo(int infoState, int infoType, int first, int max) {
		// TODO Auto-generated method stub
		return infoDAO.queryInfo(infoState, infoType, first, max);
	}

}
