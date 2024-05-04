package com.mycompany.calculator;

public class Calculator {

    public static void main(String[] args) {
        String name = "12.0";
        //name = name.substring(0,name.length()-1);
        int r = name.indexOf(".0");
        name = name.substring(0,r);
        System.out.print(name);
    }
}
