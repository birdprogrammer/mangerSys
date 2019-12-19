package com.woniu.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDao ud;
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		ud.save(user);
	}
	@Override
	public Integer getUid(User user) {
		// TODO Auto-generated method stub
		return ud.getUid(user);
	}
	@Override
	public String login(User user) {
		List<User> users = ud.findOneByName(user);
		String uname = "";
		String upwd = "";
		for (User u : users) {
			uname = u.getUname();
			upwd = u.getUpwd();
		}
		if(user.getUname().equals(uname) && user.getUpwd().equals(upwd)) {
			return "success";
		}
		return "null";
	}
	
	

}