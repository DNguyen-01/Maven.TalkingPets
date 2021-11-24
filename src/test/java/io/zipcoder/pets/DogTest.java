package io.zipcoder.pets;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest extends TestCase {

    private String name = "simba";
    private Dog dog;


    @Before
    public void setUp(){
        this.dog = new Dog(name);

    }

    @Test
    public void testSpeak() {
        //given
        //when
        String actual =  dog.speak();
        //then
        Assert.assertEquals("woof", actual);

    }

    @Test
    public void testName(){
        //given
        //when
        String actual = dog.getName();
        //then
        Assert.assertEquals(name, actual);

    }

}