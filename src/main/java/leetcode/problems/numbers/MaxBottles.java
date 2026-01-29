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
            int rem = numBottles % numExchange;
            numBottles = numBottles / numExchange;
            sum += numBottles;
            numBottles = numBottles + rem;
        }

        return sum;
    }
}
