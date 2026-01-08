package com.spring_core.DI.Injecting_Objects;

public class Student2 {

    public void setMyChit(MathChit myChit) {
        this.myChit = myChit;
    }

    MathChit myChit;

    public void doCheat() {
        myChit.mathChit();
    }
}
