package leetcode.problems.numbers;

public class PrintNumberWithoutLoop {

    public static void main(String[] args) {
        printNumbers(10);
    }

    public static void printNumbers(int number) {
        if (number == 0) {
            return;
        }

        printNumbers(number - 1);
        System.out.print(number + " ");
    }
}
