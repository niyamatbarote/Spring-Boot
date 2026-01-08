package com.spring_core.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// How @Autowired Works?
// 1. First it try to resolve with "byType";
// 2. If byType fails then it goes with "byName"

public class Human {
    @Autowired
    @Qualifier("myHeart")
    private Heart myHeart;

    // Constructor Must be needed to Ue @Autowired Annotation
    // Qualifier Annotation Cannot be Added here It will give error
//    @Autowired
    public Human(Heart myHeart) {
        this.myHeart = myHeart;
    }

    // Along with the Constructor default constructor is also MUST!!
    public Human() {

    }

    // It Uses the SETTER Method to Inject The Object(while autowiring in XML)
    // we can even use @Autowired Annotation to SETTER & It WILL WORK TOO!!
    // If we don't Use @Autowired & @Qualified Here. Then Setter MEthod Will Not be Called
    // Annotations Doesn't Use THe setter Method (If QUALIFIER is Used))
    public void setMyHeart(Heart myHeart) {
        this.myHeart = myHeart;
        System.out.println("Setter Method is Called..!!");
    }

    public void isHuman() {
        myHeart.heartBeating();
    }

}
