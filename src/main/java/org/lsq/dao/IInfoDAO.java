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
}
