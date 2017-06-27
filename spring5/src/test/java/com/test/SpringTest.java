package com.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mashen.ssh.model.User;
import com.mashen.ssh.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:applicationContext.xml"))
public class SpringTest {
	
	@Resource(name="userServiceImp")
	
	private IUserService service;
	
	@Test
	public void dotest(){
		
		service.add();
		
	}
	@Test
	public void test1(){
		System.out.println(service.query());
	}
	@Test
	public void test2(){
		System.out.println(service.queryId(1));
	}
	
	@Test
	public void test3(){
		service.addTwo(0);
	}
	@Test
	public void test4(){
		service.addByH();
	}
	@Test
	public void test5(){
		service.selectbyid(9);
		System.out.println();
	}
}
