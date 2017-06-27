package com.mashen.ssh.service;

import java.util.List;

import javax.annotation.Resource;
import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mashen.ssh.dao.IUserDao;
import com.mashen.ssh.model.User;
@Transactional(rollbackFor=java.lang.Exception.class)
@Service("userServiceImp")
public class UserServiceImp implements IUserService {
	@Resource(name="userDaoImp")
	private IUserDao dao ;

	public void add() {
		User user = new User();
		user.setUserName("wuge1");
		dao.add(user);

	}

	public List<User> query() {
		// TODO Auto-generated method stub
		return dao.queryList();
	}

	public List<User> queryId(int id) {
		// TODO Auto-generated method stub
		return dao.queryId(id);
	}

	public void addTwo(int i) {
		User user = new User();
		user.setUserName("wuge4");
		dao.add(user);
		
		if(i==1){
			throw new RuntimeException();
		}
		
		User user2 = new User();
		user2.setUserName("wuge5");
		dao.add(user2);
		
	}

	public void addByH() {
		User user = new User();
		user.setUserName("wuge1");
		dao.addByH(user);
		
	}

	public User selectbyid(int id) {
		// TODO Auto-generated method stub
		return dao.selectbyid(id);
	}

}
