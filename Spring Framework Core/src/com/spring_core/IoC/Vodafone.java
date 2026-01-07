package com.spring_core.IoC;

public class Vodafone implements Sim {
    Vodafone() {
        System.out.println("I'm Constructor of Vodafone");
    }


    @Override
    public void calling() {
        System.out.println("Calling Using Vodafone Sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing Internet Using Vodafone Sim");
    }
}
