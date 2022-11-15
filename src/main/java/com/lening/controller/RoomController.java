package com.lening.controller;

import com.github.pagehelper.PageInfo;
import com.lening.entity.RoomBean;
import com.lening.entity.UserBean;
import com.lening.service.RoomService;
import com.lening.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Resource
    private RoomService roomService;
    @Resource
    private UserService userService;

    @RequestMapping("/findAll")
    public PageInfo<RoomBean> findAll(@RequestBody(required = false) RoomBean roomBean,
                                      @RequestParam(defaultValue = "1") Integer pageNum,
                                      @RequestParam(defaultValue = "3") Integer pageSize){

        return roomService.findAll(roomBean,pageNum,pageSize);
    }
    @RequestMapping("/save")
    public String save(@RequestBody UserBean userBean, Integer[] userids){
        if(userBean!=null){
            int num = userService.save(userBean,userids);
            if (num>0){
                return "ok";
            }else {
                return "no";
            }
        }else {
            return "no";
        }

    }
    @RequestMapping("/getUserlist")
    public List<UserBean> getUserlist(){
        return userService.getUserlist();
    }

}
