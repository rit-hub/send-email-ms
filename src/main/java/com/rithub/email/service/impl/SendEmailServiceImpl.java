package com.rithub.email.service.impl;

import com.rithub.email.model.Email;
import com.rithub.email.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailServiceImpl implements SendEmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public String sendMail(Email email) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(email.getToEmail().toArray(new String[0]));
        simpleMailMessage.setCc(email.getToCC().toArray(new String[0]));
        simpleMailMessage.setSubject(email.getSubject());
        simpleMailMessage.setText(email.getBody());
        javaMailSender.send(simpleMailMessage);
        return "Mail sent Successfully....";
    }
}
