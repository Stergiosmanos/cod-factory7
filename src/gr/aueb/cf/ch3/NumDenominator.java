package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int demoninator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert numerator (Quit with numerator = 0)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero. Quiting...");
                break;
            }

            System.out.println("Please insert demoninator");
            demoninator = scanner.nextInt();

            if (demoninator == 0) {
                System.out.println("Demoninator must not be zero.");
                continue;
            }

            result = numerator / demoninator;
            System.out.println("The result is: " + result);
        }
    }
}
