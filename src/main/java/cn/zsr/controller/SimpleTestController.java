package cn.zsr.controller;

import cn.zsr.service.SimpleTestBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class SimpleTestController {

    @Autowired
    private SimpleTestBusiness simpleTestBusiness;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return simpleTestBusiness.test();
    }
}
