package com.stackroute.pe1;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reversedNumber = 0, remainder, originalNumber, sum = 0;
        originalNumber = num;

        while (num != 0) {
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
                System.out.println(reversedNumber + " is palindrome and sum of even numbers is greater than 25");
            else
                System.out.println(reversedNumber + " is palindrome and sum of even numbers is less than 25");
        }
        else
            System.out.println("Number is not Palindrome");
    }
}
