import com.zhzh.CommonApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = CommonApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class AppTest {
    @Test
    public void testStart() throws Exception {
        Thread.sleep(Long.MAX_VALUE);
    }
}
