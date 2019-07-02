package com.sample.di.demo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	/* @Autowired  셋터 메소드에 붙여되며 매개변수의 타입을 따라간다.*/
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
