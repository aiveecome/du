package com.mashen.ssh.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("登陆验证");
		String result =null;
		try{
			result = invocation.invoke();
		}catch(Exception ex){
			ActionContext a = invocation.getInvocationContext();
			HttpServletRequest req = (HttpServletRequest) a.get(StrutsStatics.HTTP_REQUEST);
			System.out.println("进行中.....");
			req.setAttribute("msg", "网络繁忙...请重新登陆！");
			return "error";
		}
		
		
		
		return result;
	}

}
