package com.stackroute.javape2;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyOfWordsTest {

    FrequencyOfWords check;
    @Before
    public void setUp(){
        System.out.println("Before run");
        check=new FrequencyOfWords();
    }

    @After
    public void tearDown()
    {
        System.out.println("After tear");
        check=null;
    }

    @Test
    public void givenInputShouldReturnSuccessMessage(){
        //arrange
        try {

            //act
            Map result = check.countWords();

            //assert
            assertEquals(Map.of("sleep",1, "a",2, "like",1, "have",1, "i",3, "man",1, "to",1, "am",1, "home",1), result);
        } catch(Exception err) {
            System.out.println((err));
        }
    }

}