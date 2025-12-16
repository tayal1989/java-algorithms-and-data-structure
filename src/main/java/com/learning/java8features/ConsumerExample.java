package com.learning.java8features;

import java.util.function.Consumer;

class Movie {
    String name;

    Movie(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello World!");

        Consumer<Movie> c1 = m -> System.out.println(m.name + " ready to release");
        Consumer<Movie> c2 = m -> System.out.println(m.name + " released, however, it didn't earned upto the expectations");
        Consumer<Movie> c3 = m -> System.out.println(m.name + " storing information in database");
        Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

        Movie m = new Movie("Pathaan");
        cc.accept(m);
    }
}
