package com.spring_core.propertiesFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MyStudent std = context.getBean("niyamat", MyStudent.class);

        std.displayStudentInfo();



    }

}
