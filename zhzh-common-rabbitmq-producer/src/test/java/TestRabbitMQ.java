import com.zhzh.CommonApplication;
import com.zhzh.service.IMessageProducerService;
import com.zhzh.service.impl.MessageProducerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.function.Function;

@SpringBootTest(classes = CommonApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestRabbitMQ {
    @Resource
    private IMessageProducerService messageProducer;

    @Test
    public void testSend() throws Exception {
        for (int x = 0; x < 100; x++) {
            this.messageProducer.sendMessage("mldn - " + x);
        }
    }
}
