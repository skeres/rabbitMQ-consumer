package com.sks.demo;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RabbitMQListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener1(@Payload StringMessage01 stringMessage01, @Headers Map<String, Object> headers ) {
        String TheType=(String) headers.get("__TypeId__");
        System.out.println("TheType="+TheType);
        System.out.println("StringMessage01 recieved : " + stringMessage01.toString());



    }

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener2(@Payload ObjectMessage01 objectMessage01, @Headers Map<String, Object> headers ) {
        String TheType = (String) headers.get("__TypeId__");
        System.out.println("TheType=" + TheType);
        System.out.println("ObjectMessage01 recieved : " + objectMessage01.toString());
    }

}