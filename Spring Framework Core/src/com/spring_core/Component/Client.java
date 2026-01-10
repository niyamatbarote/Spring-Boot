package com.spring_core.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

//        If we want to Perform Configuration without Using Xml File then we can use other method too
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring_core.Component");
        College clg = context.getBean("clgBean" , College.class);

        System.out.println(clg);
        clg.clgDetails();
    }
}
