package com.company;

import java.util.Locale;

public class BuiltInFunction {
    public static void main(String[] args) {
//        .length() function
        String name ="Abhishek";
        System.out.println(name.length());

//        .toUpperCase() & .toLowerCase()
        System.out.println(name.toUpperCase()+" " +name.toLowerCase());


        // "\t" & "\n"
        System.out.println("hello My name is\t\t\t\t\t"+name);
        System.out.println("hello my \n name is "+name);



//.endsWith() function
        System.out.println(name.endsWith("ah"));

//        Math function
        System.out.println(Math.pow(25,0.5));
    }
}
