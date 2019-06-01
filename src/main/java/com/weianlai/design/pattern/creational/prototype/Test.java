package com.weianlai.design.pattern.creational.prototype;

/**
 * @author: weianlai
 * @motto: In doing we learn
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println(mail);
        for (int i = 0; i < 10; i++) {
            Mail tempEmail = (Mail) mail.clone();
            tempEmail.setName("姓名" + i);
            tempEmail.setEmailAddress("姓名" + i + "@qq.com");
            tempEmail.setContent("嘻嘻哈哈");
            MailUtil.sendMail(tempEmail);
            System.out.println(tempEmail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }

}
