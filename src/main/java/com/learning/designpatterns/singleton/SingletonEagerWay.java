package com.learning.designpatterns.singleton;

public class SingletonEagerWay {

    private static SingletonEagerWay singletonEagerWay = new SingletonEagerWay();

    public static SingletonEagerWay getSingletonEagerWay() {
        return singletonEagerWay;
    }
}
