package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(5);
        Scanner in =new Scanner(System.in);
//        int x = in.nextInt();
        arr.add(in.nextInt());
        arr.add(in.nextInt());
        arr.add(in.nextInt());
        arr.add(in.nextInt());
        arr.add(in.nextInt());
        arr.add(in.nextInt());
        arr.add(in.nextInt());
        System.out.println(arr);
    }
}
