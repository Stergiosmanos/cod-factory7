package gr.aueb.cf.ch6;

/**
 * Έστω ένας πίνακας με στοιχεία της επιλογής σας. Γράψτε
 * μεθόδους που κάνουν τα παρακάτω
 * • 1. Αναζήτηση ενός στοιχείου στον πίνακα (Επιστρέφει την θέση
 * του στοιχείου)
 * • 2. Φιλτράρισμα των ζυγών (επιστρέφει void, μόνο εκτύπωση των
 * ζυγών)
 * • 3. Mapping κάθε στοιχείου του πίνακα με το διπλάσιο (η μέθοδος
 * επιστρέφει πίνακα)
 * • 4. Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός (η μέθοδος
 * πρέπει να επιστρέφει boolean)
 * • 5. Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί (η
 * μέθοδος πρέπει να επιστρέφει boolean).
 */
public class Ergasia2ArraysCollections {

    public static void main(String[] args) {
        int[] arr = {2, 14, 25, 7, 60, 34, 55, -9};
        int key = 25;
        int positionOfKey = getSpecificElement(arr, key);
        int[] doubleArray = MappingDouble(arr);
        boolean isPositiveValue = positiveValue(arr);
        boolean allPositiveValues = allPositiveNumbers(arr);

        // Ερώτημα 1. Αναζήτηση στοιχείου στον πίνακα και εκτύπωση.
        if (positionOfKey == -1) {
            System.out.println("The value you are looking is not in the array.");
        } else {
            System.out.println("The value " + key + " you are looking is at position " + positionOfKey);
        }

        // Ερώτημα 2. Φιλτράρισμα ζυγών και εκτύπωση.
        evensFilter(arr);
        System.out.println();

        // Ερώτημα 3. Mapping κάθε στοιχείο του πίνακα (διπλάσιο) και εκτύπωση.
        for (int el : doubleArray) System.out.print(el + " ");
        System.out.println();

        // Ερώτημα 4. Έλεγχος αν υπάρχει έστω και ενα θετικός αριθμός.
        if (!isPositiveValue) {
            System.out.println("There are no positive numbers in the array.");
        } else {
            System.out.println("There is at least one positive number.");
        }

        //Ερώτημα 5. Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικά.
        if (!allPositiveValues) {
            System.out.println("All the values of the array are not positive.");
        } else {
            System.out.println("All the values of the array are positive numbers.");
        }



    }

    public static int getSpecificElement(int[] arr, int key) {
        int positionOfValue = -1;

        if (arr == null || arr.length <= 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                positionOfValue = i;
                break;
            }
        }
        return positionOfValue;
    }

    public static void evensFilter(int[] arr) {
        for (int el : arr) {
            if (el % 2 == 0) System.out.print(el + " ");
        }
    }

    public static int[] MappingDouble(int[] arr) {
        int[] doubleArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            doubleArr[i] = arr[i] * 2;
        }
        return doubleArr;
    }

    public static boolean positiveValue(int[] arr) {
        boolean isOnePositive = false;

        for (int el : arr) {
            if (el > 0) {
                isOnePositive = true;
                break;
            }
        }
        return isOnePositive;
    }

    public static boolean allPositiveNumbers(int[] arr) {
        boolean areAllPositive = true;
        for (int el : arr) {
            if (el < 0) {
                areAllPositive = false;
                break;
            }
        }
        return areAllPositive;
    }

}
