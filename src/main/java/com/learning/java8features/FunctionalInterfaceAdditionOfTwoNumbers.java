package com.learning.java8features;

@FunctionalInterface
interface InterfaceAdd {
    public void add(int a, int b);
}

class FunctionalInterfaceAdditionOfTwoNumbers {
    public static void main(String[] args) {
        InterfaceAdd i = (a, b) -> System.out.println("The sum is " + (a + b));
        i.add(20, 30);
        i.add(30, 40);
    }
}
