package gr.aueb.cf.ch6;

/**
 * Finds the min and max of an array.
 */
public class ArrayMinAndMax {

    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 15, 1};
        int minPosition;
        int maxPosition;

        minPosition = getMinPosition(arr);
        maxPosition = getMaxPosition(arr);

        System.out.println("Min position: " + minPosition + " has the number " + arr[minPosition] + ", Max Position " + maxPosition + " has the number " + arr[maxPosition]);


    }

    public static int getMinPosition(int[] arr) {

        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        // Δεν ξεκινάμε απο i = 0 γιατί κάνει μια επιπλέον σύγκριση με τον εαυτό του στην αρχή
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr) {

        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        // Δεν ξεκινάμε απο i = 0 γιατί κάνει μια επιπλέον σύγκριση με τον εαυτό του στην αρχή
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }

}
