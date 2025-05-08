package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογιστης τσεπης. θα κανει προσθεση, αφαιρεση,
 * πολλαπλασιασμο, διαιρεση και mod.
 * ο χρηστης θα δινει 2 integers και αναλογως με το
 * συμβολο της πραξης θα κανει το αντιστοιχο υπολογισμο.
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum1 = 0;
        int inputNum2 = 0;
        int result = 0;
        char operator = ' ';
        boolean isError = false;

        System.out.println("Please insert an integer, an operator and a second integer");
        inputNum1 = scanner.nextInt();
        operator = scanner.next().charAt(0);
        inputNum2 = scanner.nextInt();

        switch (operator) {
            case '+':
                result = inputNum1 + inputNum2;
                break;
            case '-':
                result = inputNum1 - inputNum2;
                break;
            case '*':
                result = inputNum1 * inputNum2;
                break;
            case '/':
                if (inputNum2 != 0) {
                    result = inputNum1 / inputNum2;
                }
                break;
            case '%':
                if (inputNum2 != 0) {
                    result = inputNum1 % inputNum2;
                }
                break;
            default:
                System.out.println("Error");
                isError = true;
                break;
        }

        if (!isError) {
            System.out.printf("%d %c %d = %d", inputNum1, operator, inputNum2, result);
        }
    }
}
