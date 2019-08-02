package com.qf.j1902.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2019/7/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LogExampleOther {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExampleOther.class);
    public static void main(String... args) {
        log.error("Something else is wrong here");
    }
}
