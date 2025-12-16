package com.learning.java8features;

interface InterfMethodReference {
    public void sum(int a, int b);
}

public class InterfaceMethodReference {
    public static void add(int a, int b) {
        System.out.println("Sum from class method : " + (a + b));
    }

    public static void main(String[] args) {
        InterfMethodReference imr = (a, b) -> System.out.println("Sum from lambda method : " + (a + b));
        imr.sum(10, 20);

        InterfMethodReference imr1 = InterfaceMethodReference::add;
        imr1.sum(20, 30);
    }
}
