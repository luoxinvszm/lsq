package org.lsq.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lsq.dao.IInfoDAO;
import org.lsq.util.IdBuilder;
import org.lsq.vo.Info;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * 
 * @author Jason
 *
 */
public class InfoDAO implements IInfoDAO{
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	// **************************通过状态查询所有************************************
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
			System.out.println("queryInfo starting······ ");

			String sql = "select * from info where infoState= " + infoState + " and infoType = "+infoType;

			if(max>0){
				
				sql=sql+" limit "+first+","+max;
			}
			System.out.println(sql);

			return getInfo(sql);
		}
	// 获得info集合的转换方法，将map的转换成list
		public List<Info> getInfo(String sql) {
			List<Info> infos = new ArrayList<Info>();
			// 对sql语句进行处理
			List rows = jdbcTemplate.queryForList(sql);
			// 对返回的list进行遍历
			Iterator it = rows.iterator();
			while (it.hasNext()) {
				Map infoMap = (Map) it.next();

				// 获得map中的每个key对应的value值

				long infoId = (Long) infoMap.get("infoId");
				String infoTitle = (String) infoMap.get("infoTitle");
				String infoContent = (String) infoMap.get("infoContent");
				String infoRemark = (String) infoMap.get("infoRemark");
				String infoDate = (String) infoMap.get("infoDate");
				int infoType = (Integer) infoMap.get("infoType");
				int infoState = (Integer) infoMap.get("infoState");
				String userName = (String) infoMap.get("userName");
				// 创建对象

				Info info = new Info();

				// 将值放到对象中

				info.setInfoId(infoId);
				info.setInfoTitle(infoTitle);
				info.setInfoContent(infoContent);
				info.setInfoRemark(infoRemark);
				info.setInfoDate(infoDate);
				info.setInfoType(infoType);
				info.setUserName(userName);
				info.setInfoState(infoState);
				// 将对象添加到infos集合中

				infos.add(info);
			}
			return infos;
		}
		
		// **************************插入校园资讯&广告************************************
	
		public int insertInfo(String infoTitle,String infoContent,String infoRemark,String infoDate,String userName,Integer infoType,Integer infoState  ){
			System.out.println("insertInfo starting······");
			int i = 0;
			long infoId = IdBuilder.getNewId(); //随机获取主键值
			String sql=" insert into info (infoId,infoTitle,infoContent,infoRemark,infoDate,userName,infoType,infoState) values("+
					    infoId+","+"'"+infoTitle+"','"+infoContent+"','"+infoRemark+"','"+infoDate+"','"+userName+"',"+infoType+","+infoState+");";
			i = jdbcTemplate.update(sql);
			return i;
		}
		
		// **************************删除校园资讯&广告************************************
		
		public int delInfo(long infoId){
			System.out.println("delInfo starting······");
			int i = jdbcTemplate.update("update info set infoState = 1 where infoId = ?", new Object[] {infoId});
			return i;
		}
		
		
		
		
}
