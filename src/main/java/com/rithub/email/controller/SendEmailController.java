package com.rithub.email.controller;

import com.rithub.email.model.Email;
import com.rithub.email.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class SendEmailController {
    @Autowired
    private SendEmailService sendEmailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody Email email) {
        return new ResponseEntity<>(sendEmailService.sendMail(email), HttpStatus.OK);
    }

}
