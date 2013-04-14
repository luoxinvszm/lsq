package org.lsq.action.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

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
