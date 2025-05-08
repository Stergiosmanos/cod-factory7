package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρεπει ημερες, ωρες, λεπτα, δευτερολεπτα,
 * σε συνολικα δευτερολεπτα.Ο χρηστης δινει τα δεδομενα
 * και εκτυπωνει το τελικο αποτέλεσμα.
 */
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {
        //αρχικοποιηση μεταβλητων
        final int SECONDS_PER_DAY = 3600 * 24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;
        int inputDays ;
        int inputHours ;
        int inputMins ;
        int inputSeconds ;
        int totalSeconds ;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Δώσε τις ημερες:");
        inputDays = in.nextInt();
        System.out.println("Δώσε τις ώρες:");
        inputHours = in.nextInt();
        System.out.println("Δώσε τα λεπτά:");
        inputMins = in.nextInt();
        System.out.println("Δώσε τα δευτερόλεπτα:");
        inputSeconds = in.nextInt();

        totalSeconds = inputSeconds + inputMins * SECONDS_PER_MINUTE  + inputHours * SECONDS_PER_HOUR
                + inputDays * SECONDS_PER_DAY ;

        System.out.printf(Locale.US, "Το συνολο των δευτερολέπτων είναι: %,d seconds\n", totalSeconds);

    }
}
