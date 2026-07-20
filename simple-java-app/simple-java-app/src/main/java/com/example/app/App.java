package com.example.app;

/**
 * Simple entry point for the application.
 this is whre your program starts
 */
public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("Simple Java Project");
        System.out.println("--------------------");
        System.out.println(a + " + " + b + " = " + calculator.add(a, b));
        System.out.println(a + " - " + b + " = " + calculator.subtract(a, b));
        System.out.println(a + " * " + b + " = " + calculator.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculator.divide(a, b));
    }
}
