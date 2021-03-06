package com.zhzh.controller;

import com.zhzh.controller.base.AbstractBaseController;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class MessageController extends AbstractBaseController {

    public MessageController(MessageSource messageSource) {
        super(messageSource);
    }

    @RequestMapping(value = "msg")
    public String getMessage(String mid) {
        System.out.println(1 / 0);
        System.out.println(super.getMessage("member.add.page"));
        System.out.print(super.getMessage("welcome.msg", mid));
        return super.getMessage("welcome.msg", mid);
    }

}
