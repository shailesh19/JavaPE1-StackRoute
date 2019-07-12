package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void givenANumberShouldReturnPalindromeAnsLessThan25()
    {
        //arrange
        String actualResult;
        Palindrome P = new Palindrome();
        //act
        actualResult=P.palindromeChecker(123454321);
        String expectedResult = "Number is Palindrome & sum is less than 25";
        //assert
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void givenANumberShouldReturnPalindromeAndGreaterThan25()
    {
        //arrange
        String actualResult;
        Palindrome P = new Palindrome();
        //act
        actualResult=P.palindromeChecker(124686421);
        String expectedResult = "Number is Palindrome & sum is greater than 25";
        //assert
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void givenANumberShouldReturnNotPalindrome()
    {
        //arrange
        String actualResult;
        Palindrome P = new Palindrome();
        //act
        actualResult=P.palindromeChecker(12345678);
        String expectedResult = "Number is not Palindrome";
        //assert
        assertEquals(expectedResult, actualResult);
    }

}