package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer:");
        int num = scanner.nextInt();

        System.out.println(num + " is even: " + isEven(num));
        System.out.println(num + " is odd: " + isOdd(num));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Delegation Design Pattern.
     *
     * @param num
     * @return
     */
    public static boolean isOdd(int num) {
        return !isEven(num);
    }

}
