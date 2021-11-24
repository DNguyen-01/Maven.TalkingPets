package io.zipcoder.pets;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest extends TestCase {

    private String name = "sly";
    private Cat cat;


    @Before
    public void setUp(){
        this.cat = new Cat(name);
    }


    @Test
    public void testName(){
        //given
        //when
        String actual = cat.getName();
        //then
        Assert.assertEquals(name, actual);

    }

    @Test
    public void testTalk(){
        //given
        //when
        String actual = cat.speak();
        //then
        Assert.assertEquals("meow", actual);
    }

}