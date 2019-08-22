package xyz.ruankun.sxsicau.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailUtil {

    private static Logger logger = LoggerFactory.getLogger(MailUtil.class);

    @Autowired
    private JavaMailSender mailSender;

    // @Autowired
    // private SimpleMailMessage templateMailMessage;//配置的模板,用此模板new一个需要使用的具体message对象,发送给用户邮箱


    /**
     * 通知有人下订单并且已经付款
     * @param from
     * @param whoShouldBeNotified
     */
    public boolean doOrderNotify(String from, String whoShouldBeNotified){
        logger.info("开始执行发送邮件通知订单成功指令");
        logger.info(whoShouldBeNotified + "将被通知,发送者是：" + from);
        //定义邮件发送器
        JavaMailSenderImpl sender = (JavaMailSenderImpl) mailSender;
        logger.info("JavaMailSenderImpl sender = (JavaMailSenderImpl) mailSender");
        //定义mime message
        MimeMessage message = sender.createMimeMessage();
        logger.info("MimeMessage message = sender.createMimeMessage()");
        MimeMessageHelper helper;
        logger.info("MimeMessageHelper helper");
        try {
            helper = new MimeMessageHelper(message, true);
            //设置内容
            helper.setSubject("下单成功通知");
            helper.setTo(whoShouldBeNotified);
            helper.setFrom(from);
            helper.setText("", true);
            logger.info("开支执行发送邮件指令");
            sender.send(message);
            logger.info("发送邮件成功");
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            logger.info("发送邮件失败" + e.getMessage());
            return false;
        }
    }
}
