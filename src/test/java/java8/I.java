package java8;

public interface I {
    void m1();
    void m2();
    default void m3() {
        System.out.println("Default method");
    }

    static int add(int a, int b) {
        System.out.println("Usage of static keyword in interface");
        return a + b;
    }
}
