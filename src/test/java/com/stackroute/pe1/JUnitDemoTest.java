//package com.stackroute.pe1;
//
//import org.junit.*;
//
//import static org.junit.Assert.*;
//
//public class JUnitDemoTest {
//    JUnitDemo jUnitDemo;
//    @Before
//    public void setup()
//    {
//        //arrange
//        System.out.println("Inside Before");
//        this.jUnitDemo=new JUnitDemo();
//    }
//    @After
//    public void tearDown()
//    {
//        System.out.println("Inside After");
//        jUnitDemo=null;
//    }
//    @BeforeClass
//    public static void beforeClass()
//    {
//        System.out.println("Before Class");
//    }
//    @AfterClass
//    public static void afterClass()
//    {
//        System.out.println("After Class");
//    }
//    @Test
//    public void givenTwoStringsShouldReturnConcatedUpperString() {
//        //act
//        String actualResult=jUnitDemo.concatAndUpperCase("hello","world");
//        //assert
//        assertNotNull(actualResult);
//        assertEquals( "HELLOWORLD", actualResult);
//    }
//    @Test
//    public void givenAStringandNullShouldReturnErrorMessage()
//    {
//        //act
//        String actualResult=jUnitDemo.concatAndUpperCase("hello",null);
//        //assert
//        assertNotNull(actualResult);
//        assertEquals( "Null value not allowed", actualResult);
//    }
//    @Test
//    public void givenStringShouldReturnTheReverse()
//    {
//        //act
//        String actualResult=jUnitDemo.reverseString("Hello");
//        //Assert
//        assertEquals("olleh" , actualResult);
//    }
//    public void givenNullShouldThrowNullPointerException()
//    {
//        //Act
//        String actualResult=jUnitDemo.reverseString(null);
//    }
//
//}