package leetcode.problems.numbers;

public class MaxBottles {

    public static void main(String[] args) {
        MaxBottles mb = new MaxBottles();
        System.out.println(mb.findMaxBottles(9, 3));
        System.out.println(mb.findMaxBottles(10, 3));
        System.out.println(mb.findMaxBottles(15, 4));
    }

    public int findMaxBottles(int numBottles, int numExchange) {
        int sum = numBottles;

        while (numBottles >= numExchange) {
            int rem = numBottles % numExchange; // 10%3 = 1, 4%3 = 1
            numBottles = numBottles / numExchange;  // 10/3 = 3, 4/3 = 1
            sum += numBottles;  // 13, 14
            numBottles = numBottles + rem;  // 4, 2
        }

        return sum;
    }
}
