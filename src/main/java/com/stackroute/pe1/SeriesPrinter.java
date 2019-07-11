package com.stackroute.pe1;

import java.util.Scanner;

public class SeriesPrinter
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i=1; i<number; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
        }
    }
}
