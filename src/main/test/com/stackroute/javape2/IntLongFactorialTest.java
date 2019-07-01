package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class IntLongFactorialTest {

    IntLongFactorial check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new IntLongFactorial();
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
    public void givenIntFactorialShouldReturnSuccessMessage(){
        //arrange


        //act
        String result=check.intFactorial();

        //assert
        assertEquals( "The factorial of 1 is 1\n" +
                "The factorial of 2 is 2\n" +
                "The factorial of 3 is 6\n" +
                "The factorial of 4 is 24\n" +
                "The factorial of 5 is 120\n" +
                "The factorial of 6 is 720\n" +
                "The factorial of 7 is 5040\n" +
                "The factorial of 8 is 40320\n" +
                "The factorial of 9 is 362880\n" +
                "The factorial of 10 is 3628800\n" +
                "The factorial of 11 is 39916800\n" +
                "The factorial of 12 is 479001600\n" +
                "The factorial of13is out of range.\n",result);
    }

    @Test
    public void givenLongFactorialShouldReturnSucessMessage(){
        //arrange

        //act
        String result=check.longFactorial();

        //assert
        assertEquals("The factorial of 1 is 1\n" +
                "The factorial of 2 is 2\n" +
                "The factorial of 3 is 6\n" +
                "The factorial of 4 is 24\n" +
                "The factorial of 5 is 120\n" +
                "The factorial of 6 is 720\n" +
                "The factorial of 7 is 5040\n" +
                "The factorial of 8 is 40320\n" +
                "The factorial of 9 is 362880\n" +
                "The factorial of 10 is 3628800\n" +
                "The factorial of 11 is 39916800\n" +
                "The factorial of 12 is 479001600\n" +
                "The factorial of 13 is 6227020800\n" +
                "The factorial of 14 is 87178291200\n" +
                "The factorial of 15 is 1307674368000\n" +
                "The factorial of 16 is 20922789888000\n" +
                "The factorial of 17 is 355687428096000\n" +
                "The factorial of 18 is 6402373705728000\n" +
                "The factorial of 19 is 121645100408832000\n" +
                "The factorial of 20 is 2432902008176640000\n" +
                "The factorial of21is out of range.\n",result);
    }


}