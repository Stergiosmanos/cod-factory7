package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Ergasia4LowHighIndexApp {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease give me the key.");
        int key = scanner.nextInt();

        int[] newArr = getLowAndHighIndexOf(arr, key);

        for (int el : newArr) {
            System.out.print(el + " ");
        }

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] LowHigh = new int[2];

        if (arr == null || arr.length < 2) {
            System.out.println("Error..");
            System.exit(1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                LowHigh[0] = i;
                break;
            }
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == key) {
                LowHigh[1] = i;
                break;
            }
        }

        return LowHigh;
    }

}
