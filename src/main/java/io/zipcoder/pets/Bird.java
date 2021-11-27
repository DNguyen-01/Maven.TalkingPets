package io.zipcoder.pets;

public class Bird extends Pet {

    public Bird(String name) {
        super(name);
    }

    //overide is due to the abstract class contain the common methods
    //shared between all the classes
    @Override
    public String speak(){
        return "tweet";
    }

}
