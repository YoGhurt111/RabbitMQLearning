package com.yoghurt.component;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * Created by Dell on 2017/6/20.
 */
@Component
public class QueueListenter implements MessageListener {
    @Override
    public void onMessage(Message msg) {
        try {
            System.out.print(msg.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
