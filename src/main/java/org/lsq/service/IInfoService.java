package org.lsq.service;

import java.util.List;

import org.lsq.vo.Info;
/**
 * 
 * @author Jason
 *
 */
public interface IInfoService {
	/**
	 * 查询info
	 * @param infoState
	 * @param infoType
	 * @param first
	 * @param max
	 * @return
	 */
	public  List<Info> queryInfo(int infoState,int infoType,int first,int max);
}
