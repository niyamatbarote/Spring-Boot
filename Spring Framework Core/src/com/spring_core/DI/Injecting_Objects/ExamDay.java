package com.spring_core.DI.Injecting_Objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamDay {
    public static void main(String[] args) {

        // Below Steps are Bypassed Using the Spring Object Injection
//        StudentCheat student = new StudentCheat();
//        MathChit chit = new MathChit();
//        student.setMyChit(chit);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        StudentCheat studentCheat = context.getBean("obj",StudentCheat.class);
        studentCheat.studCheating();
        studentCheat.getId();

        Student2 std2 = context.getBean("stud2",Student2.class);
        std2.doCheat();

    }
}
