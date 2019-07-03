package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class Member_VariableTest {
    Member_Variable check;
    @Before
    public void setUp(){
        check=new Member_Variable();
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
        String result=check.Member_Display();

        //assert
        assertEquals( " Members Name : " + "Harry Potter" + "\n Members Salary : " + 2500.3 + "\n Members Age : " + 30 ,result);
    }


}