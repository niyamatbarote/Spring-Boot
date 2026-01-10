package com.spring_core.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

// If we Use @Primary then This Class Will be Taken as a Bean (Primary)
// @Quallifier is more Powerful than the @Primary Annotation
@Primary
@Component
public class ScienceTeacher implements Teacher{

    @Value("Kokate Sir")
    private String scTeacher;

    @Override
    public void teach() {
        System.out.println("I'm Science Teacher && My Name is : "+ scTeacher );
    }
}
