package com.wql.rabbitmq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyProducer {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void send(){

        //直连消息
        rabbitTemplate.convertAndSend("DIRECT_EXCHANGE","gupao.base","A direct exchange message");

        //topicExchange
        rabbitTemplate.convertAndSend("TOPIC_EXCHANGE","shanghai.gupao.teacher","A topic exchange message");

        //fanoutExchange
        rabbitTemplate.convertAndSend("FANOUT_EXCHANGE","","A fanout exchange message");
    }
}
