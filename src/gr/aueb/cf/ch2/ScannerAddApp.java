package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * scanner demo. reads two integers from the
 * std input (keyboard) and calcucaltes thhe result.
 */
public class ScannerAddApp {

    public static void main(String[] args) {
        //δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        //Εντολες
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτυπωση αποτελεσματων
        System.out.printf("Το αθροισμα των %d και %d ειναι ισο με %d", num1, num2, sum);
    }
}
