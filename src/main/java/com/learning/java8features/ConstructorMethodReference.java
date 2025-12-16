package com.learning.java8features;

class Sample {
    private String s;

    Sample(String s) {
        this.s = s;
        System.out.println("Parameterised Constructor : " + s);
    }
}

interface InterfaceConstructor {
    public Sample get(String s);
}
public class ConstructorMethodReference {
    public static void main(String[] args) {
        InterfaceConstructor ic = Sample::new;
        ic.get("Vishal");
    }
}
