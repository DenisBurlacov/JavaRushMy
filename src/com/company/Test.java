package com.company;

public class Test {
    public static void main(String[] args) {
        String[] list = new String[5];
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
        System.out.println(list[4]);
        System.out.println(list[5]);

        int listCount = list.length;
        list[1] = "test";
        
    }
}
