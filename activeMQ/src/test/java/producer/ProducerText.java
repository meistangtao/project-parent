package producer;

import com.producer.QueueProducer;
import com.producer.TopicProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-jms-producer.xml")
public class ProducerText {

    @Autowired
    private QueueProducer queueProducer;

    @Autowired
    private TopicProducer topicProducer;

    @Test
    public void test(){
        queueProducer.sendTextMessage("activeMQ 点对点");
    }


    @Test
    public void test1(){
        topicProducer.sendTextMessage("activeMQ 订阅发布");
    }

}
