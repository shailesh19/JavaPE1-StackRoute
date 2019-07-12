package com.stackroute.pe1;

import org.jetbrains.annotations.NotNull;

import java.nio.CharBuffer;
import java.util.Scanner;

public class StringReverser
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }

}


