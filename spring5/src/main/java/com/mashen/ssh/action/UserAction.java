package com.mashen.ssh.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.web.bind.annotation.RequestParam;

import com.mashen.ssh.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("mashen")
@InterceptorRef("login2")
@Namespace("/user")
public class UserAction extends ActionSupport {
	
	@Resource(name="userServiceImp")
	private IUserService userService;
	
	@Action(value="login",results={@Result(name="success",location="/WEB-INF/user/index.jsp")})
	public String login(){
			userService.selectbyid(9);
			System.out.println(":我是谁？我要去哪里？");
		return "success";
	}

}
