package me.xueyao.activemq.producer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;

/**
 * ActiveMQ生产者
 * @author XueYao
 *
 */
public class HelloProducerTest {

    @Test
    public void test() throws Exception {
        
        //1.建立连接
        //连接工厂：所有参数默认
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        //获取连接
        Connection connection = connectionFactory.createConnection();
        //开启连接
        connection.start();
        /**
         * 创建session
         * @param1 是否开启手动事务，true事务需要手动提交，MQ才会消息持久化保存和数据库类似
         * @param2 一旦手动事务，第二个参数无效，一般写自动，自动处理消息机制
         */
        Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
        //创建队列
        Queue query = session.createQueue("helloQueue");
        //根据消息队列，创建生产者
        MessageProducer producer = session.createProducer(query);
        //生成10条消息
        for (int len = 0; len <= 9; len++) {
            //message:jms中消息的超级接口，也就是消息必须封装为message才能发送出去
            TextMessage message = session.createTextMessage("今天天气真好");
            //生产者发送消息
            producer.send(message);
        }
      
        //提交事务
        session.commit();
        //关闭连接
        producer.close();
        session.close();
        connection.stop();
        connection.close();
    }
}
