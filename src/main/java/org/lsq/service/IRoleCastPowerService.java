package org.lsq.service;

import java.util.List;

import org.lsq.vo.Power;

/**
 * 角色-权限业务逻辑处理
 * @author yhy
 * */
public interface IRoleCastPowerService {
	/**
	 * 查询指定角色的用户权限
	 */
	public List<Power> queryPowers(int id);
}
