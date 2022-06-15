package com.docker.java.service.impl;

import com.docker.java.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @Author alpaca
 */
@Service
public class SendMailServiceImpl implements SendMailService {

    @Autowired
    JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    /**
     *  发送邮件服务
     *
     * @param text String
     * @param subject String
     * @param to String
     *
     * @return String
     */
    @Override
    public boolean sendMail(String text, String subject, String to) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);

        try {
            message.setText(text);
            message.setSubject(subject);
            message.setTo(to);
            javaMailSender.send(message);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
