package io.zipcoder.pets;

public class Dog extends Pet {


    public Dog(String name) {
        super(name);
    }


    @Override
    public String speak(){
        //pay attention to the return type; it can affect the printout in the main application

        return "woof";
    }


}
