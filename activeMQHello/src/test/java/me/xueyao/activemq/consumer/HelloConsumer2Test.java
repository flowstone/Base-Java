package me.xueyao.activemq.consumer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;

/**
 * ActiveMQ Consumer 消费者
 * @author XueYao
 *
 */
public class HelloConsumer2Test {

    @Test
    public void test() throws Exception {
        
        //创建连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        //获取连接
        Connection connection = connectionFactory.createConnection();
        //开启连接
        connection.start();
        //创建session   
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //根据session，创建消息队列 
        Queue query = session.createQueue("helloQueue");
        //创建消息消费者
        MessageConsumer consumer = session.createConsumer(query);
        
        consumer.setMessageListener(new MessageListener() {
            
            @Override
            public void onMessage(Message message) {
                //获取消息
                String text;
                try {
                    text = ((TextMessage)message).getText();
                    System.out.println(text);
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });
        
       while (true) {
           
       }
      
        
    }
}
