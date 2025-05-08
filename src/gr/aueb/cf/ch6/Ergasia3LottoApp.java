package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Ζητήστε από τον χρήστη να εισάγει έξι ακεραίους από
 * 1 έως 49 και ελέγξτε αν αυτή η εξάδα περνάει από τα
 * παρακάτω φίλτρα (predicates)
 * 1. Δεν έχει πάνω από 3 άρτιους
 * 2. Δεν έχει πάνω από 3 περιττούς
 * 3. Δεν έχει πάνω από 3 συνεχόμενους
 * 4. Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα
 * 5. Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα
 */
public class Ergasia3LottoApp {

    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("Παρακαλώ εισάγετε 6 ακέραιους αριθμούς από 1 έως 49. ");
        while (i < arr.length){
            int temp;

            System.out.print((i + 1) + "ος αριθμός: ");
            temp = scanner.nextInt();

            if (temp < 1 || temp > 49) {
                System.out.println("Ο αριθμός που εισάγατε δεν είναι έγκυρος, παρακαλώ προσπαθήστε ξανά.");
                continue;
            }
            arr[i] = temp;
            i++;
        }

        areMoreThanThreeEvens(arr);
        areMoreThanThreeOdds(arr);
        areMoreThanThreeContinuous(arr);
        areMoreThanThreeExpiring(arr);
        areMoreThanThreeStarting(arr);

    }

    public static void areMoreThanThreeEvens(int[] arr) {
        int count = 0;

        if (arr == null || arr.length < 4) {
            System.out.println("Ο πίνακας είναι κενός ή πολύ μικρός");
            return;
        }

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        if (count > 3) {
            System.out.println("Η εξάδα έχει πάνω από 3 άρτιους.");
        } else {
            System.out.println("Η εξάδα δεν έχει πάνω από 3 άρτιους.");
        }
    }

    public static void areMoreThanThreeOdds(int[] arr) {
        int count = 0;

        if (arr == null || arr.length < 4) {
            System.out.println("Ο πίνακας είναι κενός ή πολύ μικρός");
            return;
        }

        for (int el : arr) {
            if (el % 2 != 0) count++;
        }

        if (count > 3) {
            System.out.println("Η εξάδα έχει πάνω από 3 περιττούς.");
        } else {
            System.out.println("Η εξάδα δεν έχει πάνω από 3 περιττούς.");
        }

    }

    public static void areMoreThanThreeContinuous(int[] arr) {
        boolean threeContinuous = false;

        if (arr == null || arr.length < 4) {
            System.out.println("Ο πίνακας είναι κενός ή πολύ μικρός");
            return;
        }

        for (int i = 0; i < arr.length - 3; i++) {
            if (arr[i + 1] - arr[i] == 1 && arr[i + 2] - arr[i + 1] == 1) {
                threeContinuous = true;
                break;
            }
        }

        System.out.println("Υπάρχουν 3 ή περισσότεροι συνεχόμενοι αριθμοί; " + threeContinuous);

    }

    public static void areMoreThanThreeExpiring(int[] arr) {
        boolean threeExpiring = false;
        int[] endings = new int[10];

        if (arr == null || arr.length < 4) {
            System.out.println("Ο πίνακας είναι κενός ή πολύ μικρός");
            return;
        }

        for (int el : arr) {
            endings[el % 10]++;
        }

        for (int count : endings) {
            if (count > 3) {
                threeExpiring = true;
                break;
            }
        }

        System.out.println("Υπάρχουν 3 ή περισσότεροι αριθμοί με τον ίδιο λήγοντα; " + threeExpiring);
    }

    public static void areMoreThanThreeStarting(int[] arr) {
        boolean threeStarting = false;
        int[] starting = new int[10];

        if (arr == null || arr.length < 4) {
            System.out.println("Ο πίνακας είναι κενός ή πολύ μικρός");
            return;
        }

        for (int el : arr) {
            starting[el / 10]++;
        }

        for (int count : starting) {
            if (count > 3) {
                threeStarting = true;
                break;
            }
        }

        System.out.println("Υπάρχουν 3 ή περισσότεροι αριθμοί στην ίδια δεκάδα; " + threeStarting);
    }


}
