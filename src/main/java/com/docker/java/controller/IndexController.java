package com.docker.java.controller;

import com.docker.java.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likele
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private SendMailService sendMailService;

    @GetMapping("/test")
    public String Index() {
        System.out.println(sendMailService.sendMail("内容", "主题", "alpaca5541@foxmail.com"));
        return "aaa";
    }
}
