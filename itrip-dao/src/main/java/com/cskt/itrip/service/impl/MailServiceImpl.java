package com.cskt.itrip.service.impl;

import com.cskt.itrip.service.MailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author Lenovo
 * @version 1.0
 * @date 2021/12/26 19:19
 */
public class MailServiceImpl implements MailService {

    @Value("${spring.mail.username}")
    private String from;

    @Resource
    private JavaMailSender mailSender;

    /**
     * HTML 文本邮件
     * @param to 接收者邮件
     * @param subject 邮件主题
     * @param context HTML内容
     * @throws MessagingException 异常
     */
    @Override
    public void sendHtmlMail(String to, String subject, String context) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(context, true);
        helper.setFrom(from);
        mailSender.send(message);
    }
}
