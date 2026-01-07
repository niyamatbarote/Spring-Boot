package com.spring_core.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student std = context.getBean("std", Student.class);
        std.displayStudDetails();

        Student mahemud = context.getBean("name", Student.class);
        mahemud.displayStudDetails();

        Student niya = context.getBean("roll", Student.class);
        niya.displayStudDetails();



    }
}
