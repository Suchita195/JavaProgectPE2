package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class Powerof4CheckerTest {

    Powerof4Checker check;
    @Before
    public void setUp(){
        check=new Powerof4Checker();
    }
    @After
    public void tearDown()
    {
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){

    }
    @AfterClass
    public static void tearDownAfterClass()
    {

    }
    @Test
    public void givenInput1ShouldReturnSuccessMessage(){
        //arrange


        //act
        boolean result=check.powerof4Checker(256);

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenInput2ShouldReturnSuccessMessage(){
        //arrange

        //act
        boolean result=check.powerof4Checker(64);

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage(){
        //arrange

        //act
        boolean result=check.powerof4Checker(1);

        //assert
        assertEquals(true,result);
    }


    @Test
    public void givenInput4ShouldReturnErrorMessage(){
        //arrange

        //act
        boolean result=check.powerof4Checker(45);

        //assert
        assertEquals(false,result);
    }



}