package com.zhzh.controller;

import com.zhzh.service.BeanServiceImpl;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class BeanController {
    //通过xml文件注入
    @Resource(name = "beanService")
    private BeanServiceImpl beanServiceImpl;
    //通过注解bean 注入
    @Resource(name ="beanServiceImpl")
    private BeanServiceImpl beanServiceImpl1;

    @RequestMapping("/bean")
    public String getMsg() {
        return beanServiceImpl.getMessage();
    }


}
