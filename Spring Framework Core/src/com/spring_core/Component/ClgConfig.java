package com.spring_core.Component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
// No need to use this @ComponentScan Annotation As we are going to use @Bean
//@ComponentScan(basePackages = "com.spring_core.Component")
public class ClgConfig {

//    @Bean(name = "clgBean")
//     To give multple names to a Bean:-
    /* @Bean(name = {"clgBean","collegeBean","colg","clg"})
    public College collegeBean() {
        College clg = new College(principal());
        clg.setTeacher(mathTeachr());
        return clg;
    }

    @Bean
    public Principal principal() {
        return new Principal();
    }

    @Bean
    public Teacher mathTeachr() {
        return new mathTeacher();
    }
*/



}
