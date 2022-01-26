package com.company;

public class GreatestElement {
//    Find the greatest element in the array
public static void main(String[] args) {
    int arr[]={23,0,12,45,9000,70};
    int newarr[]={23,56,99,200,600,800,2000};
    System.out.println(max(newarr));
    System.out.println(max(arr));

}
static int max(int arr[]){
    int max = arr[0];
    for (int i=0; i<arr.length; i++){
        if (arr[i]>max){
            max=arr[i];
        }}
        return max;
    }

}
