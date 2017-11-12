package me.xueyao.activemq.consumer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
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
public class HelloConsumerTest {

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
        
       //死循环消费生产队列中所有消息 
       while (true) {
           //接收消息，如果5000毫秒无反应则返回null
           Message message = consumer.receive(5000);
           
           if (null != message) {
               //获取消息
               String text = ((TextMessage)message).getText();
               System.out.println(text);
           } else {
               System.out.println("消息处理完毕，退出消费");
               break;
           }
       }
        
        //关闭消费者
        consumer.close();
        
        session.close();
        connection.stop();
        connection.close();
        
    }
}
