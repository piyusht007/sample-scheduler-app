package org.scheduler.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.scheduler.demo.config.AppConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class AsyncTransactionProcessorApplicationTests {

    @Test
    public void contextLoads() {
    }
}
