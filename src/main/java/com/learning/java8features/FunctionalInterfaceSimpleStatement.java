package com.learning.java8features;

@FunctionalInterface
interface Interf {
    public void m1();
}

class FunctionalInterfaceSimpleStatement {
    public static void main(String[] args) {
        Interf i = () -> System.out.println("Hello... by lambda expression");
        i.m1();
    }
}
