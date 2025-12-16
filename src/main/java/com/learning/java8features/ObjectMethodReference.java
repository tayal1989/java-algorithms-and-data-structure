package com.learning.java8features;

public class ObjectMethodReference {
    public void m1() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        ObjectMethodReference omr = new ObjectMethodReference();
        Runnable r = omr::m1;
        Thread t = new Thread(r);
        t.start();
        for(int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
