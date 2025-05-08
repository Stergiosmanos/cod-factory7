package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 *
 */
public class ArrayDeepCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copied;

        copied = arrDeepCopy(arr);

        for (int el : copied) {
            System.out.print(el + " ");
        }
    }

    /**
     * It does a fresh copy (deep copy) of an array.
     * @param source the source array.
     * @return the copied array.
     */
    public static int[] arrDeepCopy(int[] source) {

        int[] destination = new int[source.length];

//        for (int i = 0; i < source.length; i++) {
//            destination[i] = source[i];
//        }

        System.arraycopy(source, 0, destination, 0, source.length);

        // Εδω η 3η παράμετρος είναι το πόσα στοιχεία. Δεν είναι index σε αντίθεση με την copyOfRange
       destination = Arrays.copyOf(source, source.length);

       // Η τρίτη παράμετρος είναι το end index - 1. Στην πραγματικότητα είναι από 0 έως length - 1
       destination = Arrays.copyOfRange(source, 0, source.length);

        return destination;
    }
}
