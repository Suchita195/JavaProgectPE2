package com.stackroute.javape2;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;

public class DisplayFilesInAFolderTest {
    DisplayFilesInAFolder check;
    @Before
    public void setUp(){
        check=new DisplayFilesInAFolder();
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
    public void givenInputShouldReturnSuccessMessage() throws IOException {
        //arrange


        //act
        String result=check.findFiles();

        //assert
        assertEquals("\nSuchita Kanchhal\n" +
                "Is an IBM engineer",result);
    }

}