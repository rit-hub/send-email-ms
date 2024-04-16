package com.rithub.email;

import com.rithub.email.model.Email;
import com.rithub.email.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@SpringBootApplication
public class SendEmailApp {
//    @Autowired
//    private SendEmailService sendEmailService;

    public static void main(String[] args) {
        SpringApplication.run(SendEmailApp.class, args);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void sendMail() {
//        System.out.println(sendEmailService.sendMail(Email.builder()
//                .subject("Test Subject")
//                .body("Test Body")
//                .build()));
//    }

}
