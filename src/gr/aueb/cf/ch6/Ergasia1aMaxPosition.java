package gr.aueb.cf.ch6;

/**
 * Αναπτύξτε μία γενική μέθοδο εύρεσης του
 * μέγιστου ενός πίνακα getMaxPosition (int[]
 * arr, int low, int high) που επιστρέφει τη
 * θέση στον πίνακα arr του μέγιστου
 * στοιχείου του πίνακα.
 */
public class Ergasia1aMaxPosition {

    public static void main(String[] args) {
        int[] arr = {2, 14, 25, 7, 60, 34, 55, 9};

        int maxPosition = getMaxPosition(arr, 0, arr.length - 1);

        if (maxPosition == -1) {
            System.out.println("No such element");
            System.exit(1);
        }
        System.out.printf("The max is at position %d with value %d", maxPosition + 1, arr[maxPosition]);

    }


    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = 0;
        int maxValue;

        if (arr == null || arr.length < 1) return -1;
        if ((low < 0) || (high > arr.length - 1) || (low > high)) {
            return -1;
        }

        maxValue = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
