package com.stackroute.pe1;

import java.util.Scanner;

public class DisplayTotal
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter Number of integers ");
        int number = input.nextInt();

        int[] store = new int[number];
        System.out.println(" Enter Numbers ");
        for (int i=0; i<store.length; i++)
        {
            store[i] = input.nextInt();
            sum = sum+store[i];
        }
        System.out.println("Sum is: "+sum );
        }
}



//        for(int i=1;i<=array.length;i++)
//        {
//            array[i] = input.nextInt();
//        }