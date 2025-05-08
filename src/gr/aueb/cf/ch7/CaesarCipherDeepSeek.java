package gr.aueb.cf.ch7;

import java.util.Scanner;

public class CaesarCipherDeepSeek {

    // Μέθοδος για την κρυπτογράφηση
    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                char encryptedChar = (char)(((currentChar - base + shift) % 26) + base);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }

    // Μέθοδος για την αποκρυπτογράφηση
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift); // Αποκρυπτογράφηση είναι η κρυπτογράφηση με αντίθετη ολίσθηση
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Αλγόριθμος Καίσαρα - Κρυπτογράφηση/Αποκρυπτογράφηση");
        System.out.println("1. Κρυπτογράφηση");
        System.out.println("2. Αποκρυπτογράφηση");
        System.out.print("Επιλέξτε (1/2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Καθαρίζουμε το buffer

        System.out.print("Εισάγετε το κείμενο: ");
        String text = scanner.nextLine();

        System.out.print("Εισάγετε την ολίσθηση (αριθμό): ");
        int shift = scanner.nextInt();

        String result;
        if (choice == 1) {
            result = encrypt(text, shift);
            System.out.println("Κρυπτογραφημένο κείμενο: " + result);
        } else if (choice == 2) {
            result = decrypt(text, shift);
            System.out.println("Αποκρυπτογραφημένο κείμενο: " + result);
        } else {
            System.out.println("Μη έγκυρη επιλογή!");
        }
        scanner.close();
    }
}
