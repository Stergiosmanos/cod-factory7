package gr.aueb.cf.ch2;

/**
 * A small frog wants to go to the other side of the road.
 * the frog is currently located at position X and wants to
 * a position greater or equal to Y. the small frog jumps a
 * fixed distance D. Find the minimum number of jumps.
 * X = 10
 * Y = 85
 * D = 30
 *
 * Jumps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 = 100
 */
public class FrogsJumpsApp {

    public static void main(String[] args) {
        int start = 10;
        int target = 85;
        int hop = 30;
        int jumps = 0;

        //calculate jumps
        jumps = (int) Math.ceil((target - start) / (double) hop);
        // Η ceil κανει round up.

        System.out.println("Jumps: " + jumps);
    }
}
