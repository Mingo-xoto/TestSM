package com.yhq.dao;

import org.springframework.stereotype.Repository;

import com.yhq.pojo.User;

@Repository
public interface UserMapper {
    public int insert(User user);
    public User select(int id);
}
