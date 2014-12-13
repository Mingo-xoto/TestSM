package com.yhq.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhq.dao.UserMapper;
import com.yhq.pojo.User;
import com.yhq.service.IUserService;

@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
	System.out.println("name:" + user.getName() + "--id:" + user.getId());
	return this.userMapper.insert(user);
    }

    public boolean select(int id) {
	if (this.userMapper.select(id) != null)
	    return true;
	return false;
    }
}
