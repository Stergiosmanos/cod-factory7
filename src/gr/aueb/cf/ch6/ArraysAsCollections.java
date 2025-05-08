package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 3, 5, 6, 7, 9};
        int[] arr3 = {11, 21, 33, 44, 55, 6, 7};
        double average = avg(arr2);
        boolean areThreeConsecutive = moreThanTwoConsecutive(arr2);
        boolean moreThanTwoWithSameEnding = moreThanTwoWithSameEnding2(arr3);

        int[] eventsArray = getEvens(arr);
        int[] doubleArray = mapToDouble(arr2);

        // Εκτύπωση τον arr
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

        // Εκτύπωση ζυγών αριθμών του arr
        for (int el : eventsArray) {
            System.out.print(el + " ");
        }
        System.out.println();

        for (int el : doubleArray) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.printf("%.2f\n", average);
        System.out.println("There are 3 numbers consecutive: " + areThreeConsecutive);
        System.out.println("There are more than two numbers with same ending: " + moreThanTwoWithSameEnding2(arr3));

    }

    // Βρίσκει και επιστρέφει έναν νέο πίνακα με μόνο τους ζυγούς αριθμούς του πίνακα arr
    // Filtering!
    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if ( el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        int pivot = 0;
        for (int el : arr) {
            if (el % 2 ==0) {
                evens[pivot++] = el;
            }
        }
        return evens;
    }

    // Mapping
    public static int[] mapToDouble(int[] arr2) {
        int[] mappedArray = new int[arr2.length];

        for (int i = 0; i < arr2.length; i++) {
            mappedArray[i] = arr2[i] * 2;
        }
        return mappedArray;
    }

    // Reducing
    public static int sum(int[] arr2) {
        int sum = 0;
        for (int el : arr2) {
            sum += el;
        }
        return sum;
    }

    public static double avg(int[] arr2) {
        return sum(arr2) / (double) arr2.length;
    }

    public static boolean anyEven(int[] arr2) {
        boolean isAnyEven = false;
        for (int el : arr2) {
            if (el % 2 == 0) {
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr2) {
        int count = 0;
        boolean isEvens2 = false;

        for (int el : arr2) {
            if (el % 2 == 0) count++;
        }

        if (count > 2) isEvens2 = true;
        return isEvens2;

        // return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr2) {
        boolean areThreeConsecutive = false;

        for (int i = 0; i < arr2.length - 2; i++) {
            if (arr2[i + 1] - arr2[i] == 1 && arr2[i + 2] - arr2[i + 1] == 1) areThreeConsecutive = true;
        }
        return areThreeConsecutive;
    }

    // Θεωρούμε ότι είναι μαξ με 2 ψηφία.
    public static boolean moreThanTwoWithSameEnding2(int[] arr3) {
        boolean flag = false;
        int lastDigit = 0;
        int lastDigitCompare = 0;

        for (int i = 0; i < arr3.length; i++) {
            lastDigit = arr3[i] % 10;
            for (int j = i + 1; j < arr3.length; j++) {
                lastDigitCompare = arr3[j] % 10;

                if (lastDigitCompare == lastDigit) flag = true;
            }
        }

        return flag;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr3) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr3) {
            endings[num % 10]++;
        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;
    }

    public static boolean allAreEven(int[] arr3) {
        // return getEvens(arr3).length == arr3.length;

        boolean allEven = false;
        int count = 0;

        for (int el: arr3) {
            if (el % 2 == 0) count++;
        }

        return count == arr3.length;
    }

}
