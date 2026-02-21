package com.example.practicingwithgpt.lesson1.typecasting;

public class Practice {
    void main(String[]args){
        int a = 10;
        double b = a; // automatic

        double x = 10.5;
        int y = (int) x; // manual → 10

        Animal animal = new Dog(); // upcasting
        Dog d = (Dog) animal;     // downcasting
    }
}
