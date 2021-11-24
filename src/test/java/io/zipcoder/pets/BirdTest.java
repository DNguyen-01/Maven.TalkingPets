package io.zipcoder.pets;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BirdTest extends TestCase {

    private String name = "tweety";
    private Bird bird;

    @Before
    public void setUp(){
        //creating a bird object for testing environment
        //initialized the instance variable of name; because it will be used across the board
        this.bird = new Bird(name);

    }

    @Test
    public void testSpeak() {
        //given - created the object bird with the @Before
        //when
        String actual = bird.speak();
        //then
        //asserting that our expected string output will match what our method .speak will do
        Assert.assertEquals("tweet", actual);
    }

    @Test
    public void testGetName(){
        //given
        //when
        String actual = bird.getName();
        //then
        Assert.assertEquals(name, actual);
    }


}