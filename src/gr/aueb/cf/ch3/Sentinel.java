package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculate the positives count.
 */
public class Sentinel {

    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("PLease insert a num");

        while ((inputNum = in.nextInt()) >= 0) {
            positivesCount++;
            System.out.println("PLease insert a num");
        }

        System.out.println("Positives count: " + positivesCount);
    }
}
