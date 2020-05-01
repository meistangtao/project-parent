package consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-jms-consumer-topic.xml")
public class ConsumerTopicText {

    @Test
    public void test() throws IOException {
        System.in.read();
    }

    @Test
    public void test1() throws IOException {
        System.in.read();
    }

    @Test
    public void test3() throws IOException {
        System.in.read();
    }


}
