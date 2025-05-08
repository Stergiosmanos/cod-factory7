package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TwoSecrets {

    public static void main(String[] args) {
        final int SECRET_1 = 10;
        final int SECRET_2 = 20;
        int inputNum ;
        Scanner in = new Scanner(System.in);
        boolean found = false;

        while (true) {
            System.out.println("Please insert a num");
            inputNum = in.nextInt();

            if (inputNum == SECRET_1 || inputNum == SECRET_2) {
                found = true;
            }

            if (!found) {
                System.out.println("Try again");
                continue;
            }

            System.out.println("Congratulations!!");
            break;
        }
    }
}
