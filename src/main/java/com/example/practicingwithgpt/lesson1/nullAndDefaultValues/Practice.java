package com.example.practicingwithgpt.lesson1.nullAndDefaultValues;

public class Practice {
    void main(String[] args){
        int x;
        // System.out.println(x); // Compile-time error
        String name = null;
        System.out.println(name.length()); // NPE
    }

}
