package com.stackroute.pe1;

import java.util.Scanner;

public class DisplayTotal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[4];
        for(int i=1;i<=array.length;i++)
        {
            array[i] = input.nextInt();
        }
    }
}



