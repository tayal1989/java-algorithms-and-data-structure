package java8;

public class I2 implements I {
    @Override
    public void m1() {
        System.out.println("Overriding m1 method from interface");
    }

    @Override
    public void m2() {
        System.out.println("Overriding m2 method from interface");
    }

    public static void main(String[] args) {
        I2 i2 = new I2();
        i2.m1();
        i2.m2();
        i2.m3();
        System.out.println("Usage of static : " + I.add(10, 15));
    }
}
