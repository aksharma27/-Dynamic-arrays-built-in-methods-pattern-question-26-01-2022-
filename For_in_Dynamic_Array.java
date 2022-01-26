package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class For_in_Dynamic_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i =0; i<10; i++){

            list.add(in.nextInt());

        }
        for (int i =0; i<10; i++){
            System.out.println(list.get(i)+" ");
        }
    }
}
