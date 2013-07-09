package org.lsq.dao;

import java.util.List;

import org.lsq.vo.Info;
import org.lsq.vo.Message;
/**
 * 
 * @author Jason
 *
 */
public interface IInfoDAO {
/**
 * 查询info
 * @param infoState
 * @param infoType
 * @param firdt
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
public int insertInfo(String infoTitle,String infoContent,String infoRemark,String infoDate,String userName,Integer infoType,Integer infoState);
}
