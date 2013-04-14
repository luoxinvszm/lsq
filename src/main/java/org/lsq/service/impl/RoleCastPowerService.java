package org.lsq.service.impl;

import java.util.List;

import org.lsq.dao.IRoleCastPowerDAO;
import org.lsq.service.IRoleCastPowerService;
import org.lsq.vo.Power;
/**
 * 角色-权限业务逻辑处理，实现IRoleCastPowerService接口
 * */
public class RoleCastPowerService implements IRoleCastPowerService{
	private IRoleCastPowerDAO roleCastPowerDAO;
	
	
	public IRoleCastPowerDAO getRoleCastPowerDAO() {
		return roleCastPowerDAO;
	}


	public void setRoleCastPowerDAO(IRoleCastPowerDAO roleCastPowerDAO) {
		this.roleCastPowerDAO = roleCastPowerDAO;
	}


	public List<Power> queryPowers(int id) {
		return  roleCastPowerDAO.queryPowerByRoleId(id);
	}
}
