package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

       System.out.println("Please insert numerator");
       while (!in.hasNextInt()) { // state-test
           System.out.println("Error. Input must be an integer. Please insert numerator");
           in.nextLine();
       }
       numerator = in.nextInt();

        System.out.println("Please insert denominator");
        while (!in.hasNextInt()) {
            System.out.println("Error. Input must be an integer. Please insert denominator");
        //    System.out.flush();
            in.nextLine();
        }
        denominator = in.nextInt();

        if (denominator == 0) { // state-test
            System.out.println("Error. Denominator must not be zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d", numerator, denominator, result);

    }

}
