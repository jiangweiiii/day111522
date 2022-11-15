package com.lening.service.impl;

import com.lening.entity.UserBean;
import com.lening.mapper.UserMapper;
import com.lening.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<UserBean> getUserlist() {
        return userMapper.selectAll();
    }
    @Override
    public int save(UserBean userBean, Integer[] userIds) {
        return  userMapper.insertSelective(userBean);
    }
}
