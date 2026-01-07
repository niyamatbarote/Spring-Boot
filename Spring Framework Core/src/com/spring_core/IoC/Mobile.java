package com.spring_core.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {

        //IoC container contains the Instance of THe Classes(Object).
        // Beans will be created,Beans means Instance of Class (object).
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Once the Configuration is Done, Then Class Will be Executed (Constructor)First
        System.out.println("Configuration Established");

//        Airtel air = context.getBean("airtel", Airtel.class);
//        air.calling();
//        air.data();

    // If we Want to change the SIM CARD we can Change it through the beans.xml
    // we dont need to alter the Main Program.
    // Even if we want to add other SIM like JIO we can add it and use it. Without Modifying the main Class
        Sim sim = context.getBean("sim", Sim.class);
        sim.data();
        sim.calling();
    }
}
