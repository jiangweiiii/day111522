package com.lening.service;

import com.github.pagehelper.PageInfo;
import com.lening.entity.RoomBean;
import com.lening.entity.UserBean;

public interface RoomService {
    PageInfo<RoomBean> findAll(RoomBean roomBean, Integer pageNum, Integer pageSize);


}
