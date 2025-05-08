package gr.aueb.cf.ch6;

/**
 * Αντικαθιστά ένα στοιχείο του πίνακα
 * με ένα άλλο.
 */
public class ReplaceElementApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int oldVal = 3;
        int newVal = 6;

        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

        replace(arr, oldVal, newVal);

        for (int el : arr) {
            System.out.print(el + " ");
        }

    }

    public static void replace(int[] arr, int oldVal, int newVal) {
        int positionToUpdate;

        positionToUpdate = getPosition(arr, oldVal);

        // Στην if δεν έχουμε else γιατί υπάρχει το return.
        // οπότε θα εκτελεστεί είτε το ένα είτε η παρακάτω γραμμή κώδικα αναγκαστικά.
        // Αν δεν είχαμε το return τότε θα χρειαζόμασταν else.
        if (positionToUpdate == -1) {
            return;
        }

        arr[positionToUpdate] = newVal;

    }

    public static int getPosition (int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

}
