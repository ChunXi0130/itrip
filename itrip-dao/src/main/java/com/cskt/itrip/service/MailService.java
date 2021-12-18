package com.cskt.itrip.service;

import javax.mail.MessagingException;

/**
 * 邮件服务接口
 * @author Lenovo
 * @version 1.0
 * @date 2021/12/26 19:17
 */
public interface MailService {

    /**
     * HTML 文本邮件
     * @param to 接收者邮件
     * @param subject 邮件主题
     * @param context HTML内容
     * @throws MessagingException 异常
     */
     void sendHtmlMail(String to, String subject, String context) throws MessagingException;
}
