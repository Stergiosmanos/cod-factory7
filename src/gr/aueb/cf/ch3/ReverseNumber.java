package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αντιστρεφει εναν ακεραιο
 * πχ το 123 γινεται 321.
 */
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int reversedNumber = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer");
        inputNum = scanner.nextInt();

        //toDo
        tempNum = inputNum;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            reversedNumber = reversedNumber * 10 + rightDigit;
            tempNum /= 10;
        }

        //The final answer
        System.out.println("The reversed number is: " + reversedNumber);
    }
}
