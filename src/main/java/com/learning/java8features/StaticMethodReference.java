package com.learning.java8features;

class Test {
    public static void m1() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class StaticMethodReference {
    public static void main(String[] args) {
        Runnable r = Test::m1;
        Thread t = new Thread(r);
        t.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
