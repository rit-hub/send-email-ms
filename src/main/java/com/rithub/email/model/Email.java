package com.rithub.email.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Email {
    private List<String> toEmail;
    private String fromEmail;
    private String subject;
    private String body;
    private List<String> toCC;
}
