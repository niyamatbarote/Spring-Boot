package com.spring_core.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring_core.beanLifeCycle");

        PatientsDAO  pat = context.getBean("patientsDAO", PatientsDAO.class);

        pat.selectAllRows();
//        pat.destroy();

        //This method is Alternative of the context.close()
        //This Also Close IoC Container the @PreDestroy Is Implemented
        // ********** Mostly Asked in INTERVIEWS About it ***************
        context.registerShutdownHook();

        // When we Close IoC Container the @PreDestroy Is Implemented
//        context.close();


    }
}
