package org.lsq.dao;

import java.util.List;

import org.lsq.vo.Power;

/**
 * role_power表访问接口
*/
public interface IRoleCastPowerDAO {
	/**
	 * 根据角色id查询该角色权限
	 * @return 
	*/
	public List<Power> queryPowerByRoleId(int roleId);
}
