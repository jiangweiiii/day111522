package com.lening.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lening.entity.RoomBean;
import com.lening.entity.RoomTypeBean;
import com.lening.entity.UserBean;
import com.lening.mapper.RoomMapper;
import com.lening.mapper.RoomTypeMapper;
import com.lening.mapper.UserMapper;
import com.lening.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceimpl implements RoomService {
    @Resource
    private RoomMapper roomMapper;
    @Resource
    private RoomTypeMapper roomTypeMapper;

    @Override
    public PageInfo<RoomBean> findAll(RoomBean roomBean, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<RoomBean>list = roomMapper.select(roomBean);
        for (RoomBean room : list) {
            RoomTypeBean roomtype = roomTypeMapper.selectByPrimaryKey(room.getRoomType());
            room.setRoomtype(roomtype);
        }
        PageInfo<RoomBean> pageInfo = new PageInfo<RoomBean>(list);
        return pageInfo;
    }

}
