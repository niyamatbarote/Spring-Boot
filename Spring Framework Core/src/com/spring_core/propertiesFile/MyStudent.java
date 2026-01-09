package com.spring_core.propertiesFile;

import org.springframework.beans.factory.annotation.Value;

// We Must use Annotation config at beans.xml page
// @Value Inject Directly
// @Required is Used When the Value Should Not Be Null
// && If Value Will Be Null, Then The (Bean) Obj will not be Created
// @Required is Deprecated in Spring 5
// In Modern Spring Rule : We Inject Using The Constructor Injection

public class MyStudent {

    // Using @Value Tag Here We will be injecting Without Setter Method
    @Value("${stud.name}")
    private String name;
    @Value("${stud.course}")
    private String course;
    @Value("${stud.hobby}")
    private String hobby;

//    public MyStudent(@Value("Niyamat Barote") String name, @Value("Cricket") String hobby,@Value("AIML") String course) {
//        this.name = name;
//        this.hobby = hobby;
//        this.course = course;
//    }

//    @Value("Niyamat Barote")
//    @Value("${stud.name}")
    public void setName(String name) {
        this.name = name;
        System.out.println("Setter MEthod is Used to Inject Name");
    }

//    @Value("AIML")
//    @Value("${stud.course}")
    // If Injected By Using @Value Tag Here, We Will Be Using Setter Method
    public void setCourse(String course) {
            this.course = course;
        System.out.println("Setter MEthod is Used to Inject Course");

    }
//    @Value("Gaming")
//    @Value("${stud.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
        System.out.println("Setter MEthod is Used to Inject Hobby");

    }

    public void displayStudentInfo() {
        System.out.println("Name of the Student is : "+name+
                " Perceiving course : "+course+
                " with Hobby : " +hobby);
    }

}
