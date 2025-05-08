package gr.aueb.cf.ch4;

/**
 * Prints different outputs of stars.
 */
public class Stars {

    public static void main(String[] args) {

        // 10 stars horizontally
        for (int i = 1; i <= 10; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // 10 stars vertically
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }
        System.out.println();

        // 10 x 10 stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1st row: 1 star
        // 2st row: 2 stars
        // 3rd row: 3 stars, etc

        // Ascending
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Descending
        for (int i= 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Descending second way
        for (int i= 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
