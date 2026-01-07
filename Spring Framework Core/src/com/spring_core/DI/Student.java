package com.spring_core.DI;

public class Student {

    public Student(String studName) {
        this.studName = studName;
    }
    public Student(int rollNum) {
        this.rollNum = rollNum;
    }
    public Student(String studName, int rollNum) {
        this.studName = studName;
        this.rollNum = rollNum;
    }

    // Setter "MUST" be there in Order to Inject the Value (it MUST Be "Public")
//    public void setStudName(String studName) {
//        this.studName = studName;
//    }

    private String studName;

//    public void setRollNum(int rollNum) {
//        this.rollNum = rollNum;
//    }

    private int rollNum;



    void displayStudDetails() {
        System.out.println("Name of the Student is : "+ studName+"\nRoll Num of the Student is : "+rollNum);
    }

}
