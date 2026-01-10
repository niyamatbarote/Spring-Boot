package com.spring_core.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// No need to use this Annotation As we are going to use @Bean
@Component
// When we want to add the file from the properties file then we can use @PropertySOurce
@PropertySource("myStudent.property")
// If we Don't Give any Component name && not Using ANy @Bean then the default Bean id will be:-
// @Component("college")
public class College {

//    If we Don't Want to use the @Bean Annotation Then We Can Use The @Autowired ANnotation
//    @Autowired Annotation is Used to Inject  Injecting "Objects"
    @Autowired
    private Principal prince;
    @Autowired
    @Qualifier("mathTeacher")
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public College(Principal prince) {
        this.prince = prince;
    }

    // If we Use Value here we Inject Directly without usign Setter
    @Value("123412")
    int clgId;
//  @Value("ALard")
    String clgName;


    // If we Use Value here we Inject Directly using Setter
    public void setClgId(int clgId) {
        this.clgId = clgId;
        System.out.println("Setter is Used To set clgID");
    }
    @Value("Alard")
    public void setClgName(String clgName) {
        this.clgName = clgName;
        System.out.println("Setter is Used To set clgName");
    }

    public void clgDetails() {
        System.out.println("College id is : "+clgId+" & Name is : "+ clgName);
        prince.pDetails();
        teacher.teach();
    }





}
