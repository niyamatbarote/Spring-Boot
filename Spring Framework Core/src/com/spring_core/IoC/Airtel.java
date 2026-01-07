package com.spring_core.IoC;

public class Airtel implements Sim{

    Airtel() {
        System.out.println("I'm Constructor of Airtel");
    }
    @Override
    public void calling() {
        System.out.println("Calling Using Airtel Sim");
    }

    @Override
    public void data() {
        System.out.println("Browsing Internet Using Airtel Sim");
    }
}
