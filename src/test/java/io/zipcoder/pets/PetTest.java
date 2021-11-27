package io.zipcoder.pets;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetTest extends TestCase {

    private Pet dog;
    private Pet bird;
    private String name = "simba";

    @Before
    public void setUp(){

        this.dog = new Dog(name);
        this.bird = new Bird(name);

    }


    @Test
    public void testInheritance(){
        //given

        //when

        //then
    }


    @Test
    public void testTestGetName() {
        //given
        //when
         String actual = dog.getName();
        //then
        Assert.assertEquals("simba", actual);
    }

    @Test
    public void testTestSetName() {
    }

    @Test
    public void testSpeak() {
    }


}