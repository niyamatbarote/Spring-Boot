package com.spring_core.propertiesFile;

import org.springframework.beans.factory.annotation.Value;

public class MyStudent {

    private String name;
    private String course;
    private String hobby;

    @Value("Niyamat Barote")
    public void setName(String name) {
        this.name = name;
    }
    @Value("AIML")
    public void setCourse(String course) {
        this.course = course;
    }
    @Value("Gaming")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo() {
        System.out.println("Name of the Student is : "+name+
                " Perceiving course : "+course+
                " with Hobby : " +hobby);
    }

}
