package com.woniu.service;

import java.util.List;

import com.woniu.pojo.User;

public interface IUserService {
	void save(User user);
	Integer getUid(User user);//����ҳ���¼��Ϣ��ѯ����Ӧ���û�ID
	String login(User user);
}
