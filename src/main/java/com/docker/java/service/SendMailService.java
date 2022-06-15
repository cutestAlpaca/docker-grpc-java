package com.docker.java.service;

/**
 * @Author alpaca
 */
public interface SendMailService {

    /**
     *  发送邮件服务
     *
     * @param text String 内容
     * @param subject String 主题
     * @param to String 对方的邮箱
     *
     * @return String
     */
    public boolean sendMail(String text, String subject, String to);
}
