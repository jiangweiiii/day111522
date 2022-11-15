package com.lening.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
    @RequestMapping("tolsit")
    public String tolist(){
        return "room_list";
    }
    @RequestMapping("/userin")
    public String userin(){
        return "user_list";
    }
}
