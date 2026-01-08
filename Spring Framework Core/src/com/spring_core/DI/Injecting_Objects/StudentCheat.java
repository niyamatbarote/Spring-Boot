package com.spring_core.DI.Injecting_Objects;

public class StudentCheat {
    public void setId(int id) {
        this.id = id;
    }

    private int id;

    // Setter Must There to inject Using Setter Method
    public void setMyChit(MathChit myChit) {
        this.myChit = myChit;
    }
    // Even If It is "Private" we can Inject it Using beans.xml
    private MathChit myChit;

    public void studCheating() {
        myChit.mathChit();
    }
    public void getId() {
        System.out.println("ID of Student is : "+id);
    }

}
