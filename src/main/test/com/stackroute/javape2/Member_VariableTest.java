package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class Member_VariableTest {
    Member_Variable check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new Member_Variable();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Before");

    }
    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("After");

    }
    @Test
    public void givenInput1ShouldReturnSuccessMessage(){
        //arrange


        //act
        String result=check.Member_Display();

        //assert
        assertEquals( " Members Name : " + "Harry Potter" + "\n Members Salary : " + 2500.3 + "\n Members Age : " + 30 ,result);
    }


}