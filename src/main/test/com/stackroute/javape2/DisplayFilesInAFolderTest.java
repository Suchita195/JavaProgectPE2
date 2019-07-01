package com.stackroute.javape2;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class DisplayFilesInAFolderTest {
    DisplayFilesInAFolder check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new DisplayFilesInAFolder();
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
    public void givenInputShouldReturnSuccessMessage() throws IOException {
        //arrange


        //act
        String result=check.findFiles();

        //assert
        assertEquals("\nSuchita Kanchhal\n" +
                "Is an IBM engineer",result);
    }

}