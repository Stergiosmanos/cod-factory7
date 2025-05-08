package gr.aueb.cf.ch5;

/**
 * Οπως βλεπουμε στο τελικο αποτελεσμα η swap δεν λειτουργει
 * γιατι απλα οι τοπικες της μεταβλητες αλλαζουν τιμη μεσα
 * στην συναρτηση. Εξω απο την swap οι αλλαγες στο a, b
 * δεν ισχυουν.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a = %d, b = %d\n", a, b);
        swap(a, b);
        System.out.printf("a = %d, b = %d", a, b);
    }

    /**
     * Mutually exchanges the values of the two
     * input variables.
     *
     * @param a the first input.
     * @param b the second input.
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

}
