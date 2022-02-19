package com.community;

import com.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author Gnawix
 * @Date 2022/2/19 15:38
 * @Version 1.0
 */

@SpringBootTest
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Test
    public void sendMailTest() {
        mailClient.sendMail("yxw.666@qq.com", "TEST", "hahahahha");
    }
}
