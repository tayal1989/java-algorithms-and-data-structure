package com.learning.strings;

class OverridingToString {
    public String name;
    public int eno;

    OverridingToString(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }

    public String toString() {
        return name + " : " + eno;
    }
}

class MainMethod {
    public static void main(String[] args) {
        OverridingToString ots = new OverridingToString("Vishal", 88);
        System.out.println(ots);    // If we are not using toString method then it will return object ref variable
    }
}
