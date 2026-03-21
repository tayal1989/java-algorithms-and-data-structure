package leetcode.problems.numbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumber {

    public static void main(String[] args) {
        System.out.println(findMaxNumber(9218));
    }

    public static int findMaxNumber(int number) {
        List<Integer> list = new ArrayList<>();
        String output = "";

        while (number != 0) {
            int rem = number % 10;
            number = number / 10;
            list.add(rem);
        }

        list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            output = output + Integer.toString(list.get(i));
        }

        return Integer.parseInt(output);
    }
}
