package com.stackroute.pe1;

import java.util.Scanner;

public class InputDetector
{
    public static void charCheck(char input_char)
    {

        if (input_char >= 65 && input_char <= 90)
            System.out.println("Upper Case Alphabet");

        else if (input_char >= 97 && input_char <= 122)
            System.out.println("Lower Case Alphabet");

        else if (input_char >= 48 && input_char <= 57)
            System.out.println("Digit");

        else
        {
            System.out.println("Special character");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char input_char = input.next().charAt(0);

        charCheck(input_char);
    }
}
