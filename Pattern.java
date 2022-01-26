package com.company;

import java.util.Scanner;

//*
//* *
//* * *
//* * * *
public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner in =new Scanner(System.in);
        int N = in.nextInt();
        for (int i=0;i<N;i++){     //rows
            for (int j=0; j<=i; j++){    //columns
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
