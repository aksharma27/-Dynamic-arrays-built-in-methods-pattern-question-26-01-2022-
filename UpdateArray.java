package com.company;

import java.util.ArrayList;

public class UpdateArray {
    public static void main(String[] args) {
        ArrayList<Integer> newarr = new ArrayList<>(10);
        newarr.add(1);
        newarr.add(12);
        newarr.add(13);
        newarr.add(15);
        System.out.println(newarr);     //old value
//        System.out.println(newarr.contains(13));
        newarr.set(2,45);
        newarr.set(3,45);
        System.out.println(newarr);         //updated value

        //to find or check anything in array
        System.out.println(newarr.contains(45));

//        to remove any index
        newarr.remove(3);
        System.out.println(newarr);
    }
}
