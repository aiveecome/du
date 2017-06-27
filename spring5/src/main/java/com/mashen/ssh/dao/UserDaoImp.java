package com.mashen.ssh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mashen.ssh.model.User;

@Repository("userDaoImp")
public class UserDaoImp implements IUserDao {
	
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	
	@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	private RowMapper<User> userMapper = new RowMapper<User>() {

		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setUserId(rs.getInt("dddd"));
			user.setUserName(rs.getString("nnnn"));
			return user;
		}
	};

	public void add(User user) {
		String sql ="insert into user(userId ,userName) values("+user.getUserId()+",'"+user.getUserName()+"') ";
		jdbcTemplate.execute(sql);
	}

	public List<User> queryList() {
		String sql = "select userId as dddd,userName as nnnn from user";
		List<User> list = jdbcTemplate.query(sql, userMapper);
		return list;
	}

	public List<User> queryId(int id) {
		String sql = "select * from user where id="+id;
		List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
		return list;
	}

	public void addTwo(int id) {
		// TODO Auto-generated method stub
		
	}

	public void addByH(User user) {
		//Session session = sessionFactory.getCurrentSession();
		//Transaction t = session.beginTransaction();
	//	session.save(user);
	//	t.commit();
	//	session.close();
		
		hibernateTemplate.save(user);
		
	}

	public User selectbyid(int id) {
		User u = hibernateTemplate.load(User.class, id);
		System.out.println(u);
		return u;
	}

}
