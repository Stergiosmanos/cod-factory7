package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * MERGE SORT !!
 * Ψάχνει ένα στοιχείο σε έναν ταξινομημένο πίνακα.
 * Επιστρέφει τον δείκτη (index) του στοιχείου του πίνακα.
 * Η πολυπλοκότητα είναι log n.
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int position;
        int low = 0;
        int high = arr.length - 1;
        int value = 11;

        position = binarySearch(arr, value, low, high );

        System.out.println("The value we are looking for at position " + position + " is " + arr[position]);


    }

    /**
     *
     * @param arr
     * @param value
     * @param low
     * @param high
     * @return
     */
    public static int binarySearch(int[] arr, int value, int low, int high) {
        if ( arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == value) return mid;
        if (value > arr[mid]) {
                return binarySearch(arr, value, mid + 1, high);
        } else {
            return binarySearch(arr, value, low, mid - 1);
        }

    }
}
