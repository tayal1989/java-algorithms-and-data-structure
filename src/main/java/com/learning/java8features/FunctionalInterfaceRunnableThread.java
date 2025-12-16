package com.learning.java8features;

public class FunctionalInterfaceRunnableThread {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for(int i = 0 ; i < 10 ; i++) {
                System.out.println("Child Thread");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        for(int i = 0 ; i < 10 ; i++) {
            System.out.println("Main Thread");
        }
    }
}
