package com.yoghurt;

import com.yoghurt.service.MQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 2017/6/20.
 */

public class Main {
    public static void main(String[] args)throws Exception{
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:application-mq.xml");
        Thread thread = new Thread(context.getBean(Task.class));
        thread.start();
    }
}
