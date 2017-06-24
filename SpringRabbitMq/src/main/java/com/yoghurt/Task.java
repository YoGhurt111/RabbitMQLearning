package com.yoghurt;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 2017/6/20.
 */
@Component
public class Task implements Runnable{
    @Autowired
    private RabbitTemplate rabbitTemplate;
    private static final String queueKey = "test_queue_key";

    public void run() {
        Map<String, Object> msg = new HashMap<String, Object>();
        msg.put("data", "hello,RabbitMQ!");
        rabbitTemplate.convertAndSend(queueKey, msg);
    }
}
