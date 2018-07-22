package com.zhzh.controller.base;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class AbstractBaseController {
    private final MessageSource messageSource;

    public AbstractBaseController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    //国际化配置
    public String getMessage(String key, String... args) {

        return messageSource.getMessage(key, args, Locale.getDefault());
    }
}
