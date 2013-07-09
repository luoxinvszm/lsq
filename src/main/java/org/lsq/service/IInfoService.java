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
	/**
	 * 插入info
	 * @param infoTitle
	 * @param infoContent
	 * @param infoRemark
	 * @param infoDate
	 * @param userName
	 * @param infoType
	 * @param infoState
	 * @return
	 */
	public int insertInfo(String infoTitle,String infoContent,String infoRemark,String infoDate,String userName,Integer infoType,Integer infoState  );
	/**
	 * 删除info
	 * @param infoId
	 * @return
	 */
	public int delInfo(long infoId);
	
}
