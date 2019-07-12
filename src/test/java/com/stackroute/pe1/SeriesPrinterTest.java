package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesPrinterTest {

    @Test
    public void printer()
    {
        //arrange
        int actualResult[];
        SeriesPrinter SP = new SeriesPrinter();
        //act
        actualResult = SP.printer(5);
        int expectedResult[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        //assert
        assertArrayEquals(expectedResult,actualResult);

    }
}
