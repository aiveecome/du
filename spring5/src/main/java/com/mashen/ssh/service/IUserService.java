package com.mashen.ssh.service;

import java.util.List;

import com.mashen.ssh.model.User;

public interface IUserService {
	public void add();
	public void addTwo(int i);
	public List<User> query();
	public List<User> queryId(int id);
	public void addByH();
	
	public User selectbyid(int id);

}
