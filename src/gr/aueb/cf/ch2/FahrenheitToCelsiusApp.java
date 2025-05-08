package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Προγραμμα που να μετατρεπει ακεραιες θερμοκρασιες Fahrenheit
 * σε Κελσιου.
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        //Δηλώση και αρχικοποιηση μεταβλητων
        int fahrenheit = 0;
        int celsius = 0;
        Scanner in = new Scanner(System.in);

        //Εντολες
        System.out.println("Please insert the fahrenheit degrees:");
        fahrenheit = in.nextInt();
        celsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("%d\u2109 = %d\u2103", fahrenheit, celsius);
    }
}
