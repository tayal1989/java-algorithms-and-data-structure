package com.learning.java8features;

@FunctionalInterface
interface InterfaceSquare {
    public int square(int a);
}

class FunctionalInterfaceSquareOfNumber {
    public static void main(String[] args) {
        InterfaceSquare i1 = i -> i * i;
        System.out.println(i1.square(45));
        System.out.println(i1.square(42));
    }
}
