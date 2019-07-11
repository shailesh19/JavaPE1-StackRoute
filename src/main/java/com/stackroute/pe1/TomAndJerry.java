package com.stackroute.pe1;

import java.util.Scanner;

public class TomAndJerry {
    public static void main(String[] args)
    {

    Scanner input = new Scanner(System.in);
    int number = input.nextInt();

    if((number >= 20 && number<=30) && (number%2==0))
    {
        System.out.println("Jerry");
    }
    else
        System.out.println("Tom");
    }
}
