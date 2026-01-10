package com.spring_core.Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("clgBean")
public class College {

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
    @Value("ALard")
    public void setClgName(String clgName) {
        this.clgName = clgName;
        System.out.println("Setter is Used To set clgName");
    }

    public void clgDetails() {
        System.out.println("College id is : "+clgId+" & Name is : "+ clgName);
    }



}
