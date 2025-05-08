package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαιωμα ψηφου σε ηλικιες >18
 * Ελεγχει αν μια ηλικια εχει δικαιωμα να ψηφισει
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageInput = 0;
        final int AGE_LIMIT_VOTE = 18;
        boolean isVoteΕligible = false;

        System.out.println("Please insert the age.");
        ageInput = scanner.nextInt();

        isVoteΕligible = ageInput >= AGE_LIMIT_VOTE;

        System.out.printf("%d is eligible for voting: %b", ageInput, isVoteΕligible);
    }
}
