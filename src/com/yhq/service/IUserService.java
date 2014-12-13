package com.yhq.service;

import com.yhq.pojo.User;

public interface IUserService {
    public int insert(User user);

    public boolean select(int id);
}
