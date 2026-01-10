package com.spring_core.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class mathTeacher implements Teacher{

    @Value("Survase Sir")
    private String teacherName;

    @Override
    public void teach() {
        System.out.println("I'm a Math Teacher && Name is : " +teacherName);
    }
}
