package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class FileToUpperCaseTest {

    FileToUpperCase check;
    @Before
    public void setUp(){
        System.out.println("Before run");
        check=new FileToUpperCase();
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
            String result = check.filetoUpperCase();

            //assert
            assertEquals("\n" + "SUCHITA KANCHHALIS AN IBM ENGINEER" + "\n" + "34", result);
        } catch(Exception err) {
            System.out.println((err));
        }
    }

}