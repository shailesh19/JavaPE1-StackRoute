package com.stackroute.pe1;

import java.util.Scanner;

public class VowelConsonantChecker
{
    public static void main (String[] args )
    {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        for(int i=0; i<word.length(); i++)
        {
            char c;
            char d;
            c = word.charAt(i);
            d = Character.toUpperCase(c);
            if (d >='A' && d<= 'Z')
            {
                switch (d)
                {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println(d +"- Vowels");
                        break;
                    default:
                        System.out.println(d +"- Consonants");
                }
            }
            else
                {
                    System.out.println("Not an Alphabet");
                }
        }
    }
}
