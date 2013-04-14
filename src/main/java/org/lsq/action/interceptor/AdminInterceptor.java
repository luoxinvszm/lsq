package org.lsq.action.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
/**
 * 类名：管理员登陆拦截器
 * 作用：未登陆的用户，无法访问管理员权限的aciton
 * @author yhy
*/
public class AdminInterceptor extends MethodFilterInterceptor{
	private String username_session;
	private String reLoginResult;
	public String getReLoginResult() {
		return reLoginResult;
	}
	public void setReLoginResult(String reLoginResult) {
		this.reLoginResult = reLoginResult;
	}
	
	public String getUsername_session() {
		return username_session;
	}
	public void setUsername_session(String username_session) {
		this.username_session = username_session;
	}
	//登陆拦截方法
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext()
				.getSession();
		if (session.containsKey(username_session)) {
			String reslut = invocation.invoke();
			return reslut;
		} else {
			return reLoginResult;
		}

	}

}
