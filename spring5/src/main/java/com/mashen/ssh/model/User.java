package com.mashen.ssh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	private int userId;
	private String userName;
	
	@Id
	@Column(name="userId")
	@GeneratedValue()
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column(name="userName",length=20)
	public String getUserName() {
		return userName;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
