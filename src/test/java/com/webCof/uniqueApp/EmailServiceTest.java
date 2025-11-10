package com.webCof.uniqueApp;

import com.webCof.uniqueApp.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EmailServiceTest {


    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail(){
        emailService.sendEmail("udaykumarkella67@gmail.com","Testing java mail","hi.................");
    }
}
