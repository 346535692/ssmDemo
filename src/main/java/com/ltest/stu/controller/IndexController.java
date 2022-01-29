package com.ltest.stu.controller;


import com.ltest.stu.entity.User;
import com.ltest.stu.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * IndexController
 *
 * @author linwl
 * @version v1.0
 * @ClassName IndexController
 * @date 2022/1/27 14:07
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    /**
     * 返回字符串
     * @return
     */
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "index";
    }

    /**
     * 返回页面，没有则404
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/getBean")
    @ResponseBody
    public String getBean(){
        return indexService.say();
    }

    @RequestMapping("/findList")
    @ResponseBody
    public List<User> findList(){
        return indexService.findList();
    }
}
