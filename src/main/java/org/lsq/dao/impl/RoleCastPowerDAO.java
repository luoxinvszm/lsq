package org.lsq.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.lsq.dao.IRoleCastPowerDAO;
import org.lsq.vo.Power;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 * role_power表访问类，实现IRoleCastPowerDAO
*/
public class RoleCastPowerDAO implements IRoleCastPowerDAO{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Power> queryPowerByRoleId(int roleId) {
		String sql="select * from role_power,power where role_power.powerId=power.powerId and roleId=?";
		List<Map<String, Object>> list= jdbcTemplate.queryForList(sql, new Object[] { roleId });
		List<Power> powerList=new ArrayList<Power>();
		if(list!=null && list.size()>0){
			Iterator<Map<String,Object>> iter=list.iterator();
			while(iter.hasNext()){
				Power power=new Power();
				Map<String,Object> map=iter.next();
				power.setPowerId(Integer.parseInt(map.get("powerId").toString()));
				power.setPowerName(map.get("powerName").toString());
				power.setPowerAction(map.get("powerAction").toString());
				power.setPowerStatus(Integer.parseInt(map.get("powerStatus").toString()));
				power.setPowerRemark(map.get("powerRemark")==null?"":map.get("powerRemark").toString());
				powerList.add(power);
			}
			return powerList;
		}else{
			return null;
		}
	}

}
