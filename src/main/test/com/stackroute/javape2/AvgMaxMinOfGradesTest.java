package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class AvgMaxMinOfGradesTest {
    AvgMaxMinOfGrades check;
    @Before
    public void setUp(){
        check=new AvgMaxMinOfGrades();
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
        String result=check.avgMaxMinOfGrades(5,new int[]{45,67,26,78,97});

        //assert
        assertEquals("\"Average is:\" + 62.6 + \"Maximum is:\" + 97 + \"Minimum is:\" + 26",result);
    }

    @Test
    public void givenInput2ShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.avgMaxMinOfGrades(4,new int[]{105,76,45,89});

        //assert
        assertEquals("Value is out of range",result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage(){
        //arrange

        //act
        String result=check.avgMaxMinOfGrades(3,new int[]{56,27,97});

        //assert
        assertEquals("\"Average is:\" + 60 + \"Maximum is:\" + 97 + \"Minimum is:\" + 27",result);
    }


}