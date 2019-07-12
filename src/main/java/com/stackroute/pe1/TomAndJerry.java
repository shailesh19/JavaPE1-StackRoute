package com.stackroute.pe1;

import java.util.Scanner;

public class TomAndJerry {
    public String tomNJerry(int number)
    {

        if ((number >= 20 && number <= 30) && (number % 2 == 0))
        {
            return "Jerry";
        }
        else
            return "Tom";
    }
}

