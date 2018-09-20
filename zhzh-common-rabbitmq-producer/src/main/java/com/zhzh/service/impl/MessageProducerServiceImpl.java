package com.zhzh.service.impl;

import com.zhzh.config.ProducerConfig;
import com.zhzh.service.IMessageProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ${Author}: jason.zhao
 * 2018/8/26 14:24
 **/
@Service
public class MessageProducerServiceImpl implements IMessageProducerService {
    @Resource
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendMessage(String msg) {
        rabbitTemplate.convertAndSend(ProducerConfig.EXCHANGE, ProducerConfig.ROUTINGKEY, msg);
    }
}
