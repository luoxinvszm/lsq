package org.lsq.service;

import java.util.List;

import org.lsq.vo.User;

public interface IUserService {
	public List<User> queryUsersByRoleId(int roleId,int status);
	public void recoverUser(int userId);
	public void cancelUser(int userId);
}
