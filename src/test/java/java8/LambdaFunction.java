package java8;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunction {

    public static void main(String[] args) {
        Predicate<Integer> p =  i -> i % 2 == 0;
        System.out.println("Usage of predicate : " + p.test(10));
        System.out.println("Usage of predicate : " + p.test(11));

        Function<Integer, Integer> function = a -> a * 10;
        System.out.println("Usage of function : " + function.apply(10));

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println("Usage of bifunction : " + biFunction.apply(10, 11));

        String[] s = {"Vishal", "Naina", "Myra"};
        Predicate<String> predicate = s1 -> s1.length() % 2 == 0;
        for (String str : s) {
            System.out.println("Predicate with string and lambda : " + predicate.test(str));
        }

        int[] x = {0, 5, 10, 15, 20, 25, 30, 35};
        Predicate<Integer> p1 = c1 -> c1 % 2 == 0;
        Predicate<Integer> p2 = c2 -> c2 > 10;
        for(int number : x) {
            if(p1.and(p2).test(number)) {
                System.out.println("Multiple conditions with predicate joining : " + number);
            }
        }

    }
}
