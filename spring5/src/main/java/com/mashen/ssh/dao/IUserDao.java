package com.mashen.ssh.dao;

import java.util.List;

import com.mashen.ssh.model.User;

public interface IUserDao {
	public void add(User user);
	
	public List<User> queryList();
	
	public List<User> queryId(int id);
	
	public void addByH(User user);
	
	public User selectbyid(int id);

}
