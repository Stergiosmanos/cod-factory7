package gr.aueb.cf.ch6;

/**
 * Ελέγχουμε εάν είναι συμμετρικός ένας πίνακας.
 */
public class SymmetricApp {

    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 3, 7};

        System.out.println(isSymmetric(arr));

        System.out.println(isArraySymmetric(arr));

    }

    public static boolean isSymmetric(int[] arr) {

        boolean isSymmetric = true;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymmetric = true;
        int n = arr.length - 1;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

}
