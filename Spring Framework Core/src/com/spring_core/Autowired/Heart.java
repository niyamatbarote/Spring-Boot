package com.spring_core.Autowired;

public class Heart {

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public int getNumOfHearts() {
        return numOfHearts;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public void setNumOfHearts(int numOfHearts) {
        this.numOfHearts = numOfHearts;
    }

    private String nameOfAnimal;
    private int numOfHearts;

    public void heartBeating() {
        System.out.println("Heart is Beating \nHuman is Alive");
        System.out.println("This is " +nameOfAnimal+" & Have "+numOfHearts+" Hearts");
    }


}
