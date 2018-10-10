package com.darren.dao;

import com.darren.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}