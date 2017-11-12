package me.xueyao.activemq.consumer.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

//q的消费者1：处理消息内容
public class QueueConsumer2 implements MessageListener{

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
