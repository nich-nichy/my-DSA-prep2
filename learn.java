package com.jetbrains;

import java.util.*;

public class learn {
    
    // program for fibonacci series 
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int fibonacci = 1;
        int number = 10;

        for (int i = 3; i <= number; i++) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
            System.out.println(fibonacci + " ");
        }
    }

}

// Program for prime number


public static void main(String[] args) {
        int a = 10;

        for (int i = 0; i <= a; i++) {
            if (i == 1) {
                System.out.print("");
            }
            else if ((i % 2) != 0) {
                System.out.println(i);
            }
        }


    }


