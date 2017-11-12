package me.xueyao.activemq.producer.test;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring整合生产者  Queue Topic
 * @author XueYao
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-mq-producer.xml"})
public class ProducerTest {
    
    //注入queue的消息模板对象
    @Autowired
    @Qualifier("jmsQueueTemplate")
    private JmsTemplate jmsQueueTemplate; 
    
    //注入topic的消息模板对象
    @Autowired
    @Qualifier("jmsTopicTemplate")
    private JmsTemplate jmsTopicTemplate;
    
    @Test
    public void test() {
        for (int len = 1; len <= 10; len++) {
            final int index = len;

          //发q的消息
            jmsQueueTemplate.send("spring.queue.hello", new MessageCreator() {
                
                public Message createMessage(Session session) throws JMSException {
                    TextMessage message = session.createTextMessage("Queue消息：Spring整合后的HelloWorld"+index);
                    return message;
                }
            });
            
            //发t的消息
            jmsTopicTemplate.send("spring.topic.hello", new MessageCreator() {
                
                @Override
                public Message createMessage(Session session) throws JMSException {
                    TextMessage message  = session.createTextMessage("Topic消息：Spring整合后的HelloWorld"+index);
                    return message;
                }
            });
        }
        
    }
}
