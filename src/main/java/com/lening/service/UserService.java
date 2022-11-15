package com.lening.service;

import com.lening.entity.UserBean;

import java.util.List;

public interface UserService {
    List<UserBean> getUserlist();
    int save(UserBean userBean, Integer[] userIds);
}
