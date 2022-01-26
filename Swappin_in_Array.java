package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Swappin_in_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
//        System.out.println(Arrays.toString(arr));
//        int temp = arr[1];
//        arr[1] =arr[4];
//        arr[4]=temp;
//        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int sec = in.nextInt();
        swap(arr,first,sec);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr, int index1,int index2){

            int temp = arr[index1];
            arr[index1] =arr[index2];
            arr[index2]=temp;
    }
}
