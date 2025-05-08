package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δινει ως output τον πολλαπλασιασμο
 * ενος ακεραιου που δινει ο χρηστης
 * με ολους του ακεραιους απο 1 εως 10
 * και στο τελος δινει το αθροισμα τους.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int tempNum= 0;
        int sum = 1;
        int i = 1;

        System.out.println("Enter an integer.");
        inputNum = scanner.nextInt();

        while (i <= 10) {
           // System.out.println(inputNum + " * " + i + " = " + (inputNum * i));
            System.out.printf("%d * %2d = %2d\n", inputNum, i, inputNum * i);
            tempNum = i * inputNum;
            sum += tempNum;
            i++;
        }

        System.out.println("The sum of multiplications of the " + inputNum + " is " + sum);

    }
}
