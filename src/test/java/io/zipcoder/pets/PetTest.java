package io.zipcoder.pets;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class PetTest extends TestCase {

    private Pet dog;
    private String name = "simba";

    @Before
    public void setUp(){

        this.dog = new Dog(name);

    }


    @Test
    public void testInheritance(){
        //given

        //when

        //then
    }


    @Test
    public void testTestGetName() {
    }

    @Test
    public void testTestSetName() {
    }

    @Test
    public void testSpeak() {
    }


}