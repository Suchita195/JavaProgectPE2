package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

        PalindromeChecker check;
        @Before
        public void setUp(){
            System.out.println("Before");
            check=new PalindromeChecker();
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
        public void givenPalingromeShouldReturnSuccessMessage(){
            //arrange


            //act
            String result=check.palindromeChecker("1334331");

            //assert
            assertEquals("Entered string/number is a palindrome.",result);
        }

        @Test
        public void givenPalingromeShouldSucessMessage(){
            //arrange

            //act
            String result=check.palindromeChecker("6");

            //assert
            assertEquals("Entered string/number is a palindrome.",result);
        }

        @Test
        public void givenPalindromeShouldReturnSuccessMessage(){
            //arrange

            //act
            String result=check.palindromeChecker("icici");

            //assert
            assertEquals("Entered string/number is a palindrome.",result);
        }

        @Test
        public void givenPalindromeShouldReturnNotPalindromeMessage(){
            //arrange

            //act
            String result=check.palindromeChecker("adftdfa");

            //assert
            assertEquals("Entered string/number isn't a palindrome.",result);
        }

    }
