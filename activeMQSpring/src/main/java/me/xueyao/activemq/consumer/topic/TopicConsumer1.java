package me.xueyao.activemq.consumer.topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

//t的消费者1：处理消息内容
public class TopicConsumer1 implements MessageListener{

    @Override
    public void onMessage(Message message) {
        try {
            String text = ((TextMessage)message).getText();
            System.out.println(text+"处理人："+this.getClass().getSimpleName());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
