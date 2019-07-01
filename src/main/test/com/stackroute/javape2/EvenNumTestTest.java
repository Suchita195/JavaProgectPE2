package com.stackroute.javape2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    @Test
    public void givenInput1ShouldReturnSuccessMessage() {
        //arrange

        //act
        boolean result = EvenNumTest.isEven(0);

        //assert
        assertEquals(true, result);
    }


    @Test
    public void givenInput2ShouldReturnErrorMessage() {
        //arrange

        //act
        boolean result = EvenNumTest.isEven(1);

        //assert
        assertEquals(false, result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage() {
        //arrange

        //act
        boolean result = EvenNumTest.isEven(78);

        //assert
        assertEquals(true, result);
    }

    @Test
    public void givenInput4ShouldReturnErrorMessage() {
        //arrange

        //act
        boolean result = EvenNumTest.isEven(45);

        //assert
        assertEquals(false, result);

    }
}