package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest
{
    @Test
    public void GivenANumberBetween20and30AnsIsOddShouldPrintTom()
    {
        //arrange
        String actualResult;
        TomAndJerry TJ = new TomAndJerry();
        //act
        actualResult = TJ.tomNJerry(25);
        String expectedResult = "Tom";
        //assert
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void GivenANumberBetween20and30AnsIsOddShouldPrintJerry()
    {
        //arrange
        String actualResult;
        TomAndJerry TJ = new TomAndJerry();
        //act
        actualResult = TJ.tomNJerry(26);
        String expectedResult = "Jerry";
        //assert
        assertEquals(expectedResult,actualResult);
    }
}

