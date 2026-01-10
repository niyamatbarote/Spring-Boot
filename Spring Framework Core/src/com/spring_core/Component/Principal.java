package com.spring_core.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Principal {

    @Value("Baabuuuuu")
    private String principalName;

    public void pDetails () {
        System.out.println("Name of the principal is : " +principalName);
    }

}
