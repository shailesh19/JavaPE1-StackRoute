package com.stackroute.pe1;

import java.util.Scanner;

public class Palindrome
{
    public String palindromeChecker(int num)
    {
        int reversedNumber = 0, remainder, originalNumber, sum = 0;
        originalNumber = num;
        String variableresult = "";
        while (num != 0)
        {
            remainder = num % 10;
            if (remainder % 2 == 0)
            {
                sum = sum + remainder;
            }
            reversedNumber = reversedNumber * 10 + remainder;
            num /= 10;
        }
        if (reversedNumber == originalNumber)
        {
            if (sum > 25)
                variableresult = "Number is Palindrome & sum is greater than 25";
            else
                variableresult = "Number is Palindrome & sum is less than 25";
        }
        else
            variableresult = "Number is not Palindrome";
        return variableresult;
    }
}